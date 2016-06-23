package multiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomThreadPool 
{
	private BlockingQueue<Runnable> taskQueue;
	private List<PoolThread> threadPool;
	private boolean isStopped = false;
	
	public CustomThreadPool( int taskQueueSize, int noOfThreads )
	{
		taskQueue = new ArrayBlockingQueue<Runnable>(taskQueueSize);
		threadPool  = new ArrayList<PoolThread>(noOfThreads);
		
		for(int i=0; i < noOfThreads; i++)
		{
			threadPool.add(new PoolThread(taskQueue));
		}
		
		for(PoolThread thread : threadPool)
		{
			thread.start();
		}
	}
	
	public synchronized void execute(Runnable task) throws IllegalStateException
	{
		if(isStopped)
		{
			throw new IllegalStateException(" Thread Pool is Stopped ");
		}
		
		this.taskQueue.add(task);
	}
	
	public synchronized void doStop() 
	{
		this.isStopped = true;
		for(PoolThread thread : threadPool)
		{
			thread.doStop();
		}
	}
}
 

class PoolThread extends Thread
{
	private boolean isStopped = false;
	private BlockingQueue<Runnable> taskQueue;
	
	public PoolThread(BlockingQueue<Runnable> taskQueue)
	{
		this.taskQueue = taskQueue;
	}
	
	@Override
	public void run()
	{
		while(!isStopped)
		{
			try {
				Runnable task = taskQueue.take();
				task.run();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	
	public void doStop()
	{
		this.isStopped = true;
		this.interrupt();
	}
}