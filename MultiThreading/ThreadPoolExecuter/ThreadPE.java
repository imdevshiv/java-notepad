import java.util.concurrent.*;
class ThreadPE
{
	public static void main(String[] args)
	{
		ExecutorService es=Executors.newFixedThreadPool(5);
		
		for(int i=0;i<5;i++)
		{
			es.submit(()->
			{
				synchronized(ThreadPE.class)
				{
					for(int j=0;j<2;j++)
					{
						System.out.println("Executing "+(j+1)+ " time by "+Thread.currentThread().getName());
						try
						{
							Thread.sleep(1000);
						}
						catch(InterruptedException e)
						{ 
							e.printStackTrace();
						}
					}
					es.shutdown();
				}
			
			});
		}
	
	}

}