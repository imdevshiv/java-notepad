import java.util.concurrent.*;
class ThreadL
{
	public static void main(String[] args)
	{
		ExecutorService es=Executors.newFixedThreadPool(3,new NameThread());
		for(int i=0;i<3;i++)
		{	
			es.execute(()->
			
				synchronized(ThreadL.class)
				{
					ThreadLocal<Integer> threadLocal =new ThreadLocal<>();
					threadLocal.set(0);
					int value= threadLocal.get(); //autoUnboxing		
					for(int j=0;j<5;j++)
					{
						value++;
						System.out.println("Value in "+Thread.currentThread().getName()+" is "+value);
					}
				}	
			);
		}
		es.shutdown();
	}

}

class NameThread implements ThreadFactory
{
	int count=0;
	public Thread newThread(Runnable r)
	{
		count++;
		return new Thread(r,"DeadPool "+count);
	}

}