package harsha;

public class BaseClass implements BaseIn {

	@Override
	public void BaseInterfaceName() 
	{
		System.out.println("Base Class Implement BaseInterface");
	}
	
	public void BaseMethod(BaseClass obj)
	{
		BaseIn baseIn = (BaseIn) obj;
		baseIn.BaseInterfaceName();
	}

}
