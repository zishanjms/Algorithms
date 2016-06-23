package multiThread;

public class PaymentGateWayTestUsingCSA implements Runnable
{

	private PaymentGateWayCSA pg = null;
	private AccountCSA from = null;
	private AccountCSA to = null;
	private Double amount = 0d;
	
	public PaymentGateWayTestUsingCSA(PaymentGateWayCSA pg, AccountCSA from, AccountCSA to, Double amount)
	{
		this.pg = pg;
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		while(true)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			synchronized (this)
			{
				pg.transferFunds(from, to, amount);
				System.out.println(from);
				System.out.println(to);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		AccountCSA from = new AccountCSA(1, 1000.0);
		AccountCSA to = new AccountCSA(2, 1000.0);
		PaymentGateWayCSA pg = new PaymentGateWayCSA();
		PaymentGateWayTestUsingCSA pgt1 = new PaymentGateWayTestUsingCSA(pg, from, to, 10.0);
		PaymentGateWayTestUsingCSA pgt2 = new PaymentGateWayTestUsingCSA(pg, to, from, 10.0);
		Thread t1 = new Thread(pgt1);
		Thread t2 = new Thread(pgt2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}

class PaymentGateWayCSA {

	public boolean transferFunds(AccountCSA from, AccountCSA to, Double amount)
	{
		AccountCSA ac1 = from.compareTo(to)==1?from:to;
		AccountCSA ac2 = from.compareTo(to)==1?to:from;
		synchronized (ac1) {
			try 
			{
				System.out.println("Account Object : " + from + " is Locked");
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			synchronized (ac2) {
				from.withDraw(amount);
				to.deposit(amount);
			}
		}
		return true;
	}

}

class AccountCSA implements Comparable
{
	private int accountId;
	private Double amount;
	
	public AccountCSA(int accountId, Double amount)
	{
		this.accountId = accountId;
		this.amount = amount;
	}
	
	public void withDraw(Double am)
	{
		amount -=am;
		/*if( am>0 && amount>am){
			amount = amount - am;
		}
		else{
			System.out.println("No fund To withDraw");
		}*/
	}
	
	public void deposit(Double am)
	{
		amount += am;
		/*if(am>0){

			amount += am;
		}
		else{
			System.out.println("Deposit amount cannot be negative");
		}*/
	}
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String toString()
	{
		return "AccountId: " + accountId + " amount: " + amount;
	}

	@Override
	public int compareTo(Object obj) {
		if(obj instanceof AccountCSA) 
		{
			AccountCSA that = (AccountCSA) obj;
			if(this.accountId > that.getAccountId()) return 1;
			if(this.accountId < that.getAccountId()) return -1;
			else
				return 0;
		}
		return 0;
	}
}
