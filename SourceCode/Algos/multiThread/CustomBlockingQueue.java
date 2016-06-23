package multiThread;

import java.util.LinkedList;
import java.util.List;

public class CustomBlockingQueue<T>
{
	private List<T> queue;
	private int maxSize;
	
	public CustomBlockingQueue(int maxSize)
	{
		this.maxSize = maxSize;
		this.queue = new LinkedList<T>();
	}
	
	public synchronized void put(T obj) throws InterruptedException
	{
		while(this.queue.size() == maxSize )
		{
			wait();
		}
		if( this.queue.size() == 0 )
		{
			notifyAll();
		}
		this.queue.add(obj);
	}
	
	public synchronized T take() throws InterruptedException
	{
		while( this.queue.size() == 0 )
		{
			wait();
		}
		if( this.queue.size() == maxSize )
		{
			notifyAll();
		}
		return this.queue.get(0);
	}
}
