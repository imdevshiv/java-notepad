import java.util.concurrent.*;
class ExeTP
{
	public static void main(String[] args)throws Exception 
	{
		System.out.println("\n******** Start "+Thread.currentThread().getName()+" Thread ********");

		ExecutorService es= Executors.newFixedThreadPool(3,new NameThread());
		for(int i=0;i<3;i++)
		{
			Future future=es.submit(new Job());
			if(!future.isDone())
				System.out.println("I'm independent "+Thread.currentThread().getName()+" Thread");
			System.out.println(future.get());
			
		}
		es.shutdown();
		System.out.println("******** close "+Thread.currentThread().getName()+" Thread ********");
	}

}

class Job implements Callable<String> 
{		
	public String call()throws Exception 
	{
		Thread.sleep(500);
		return "Shiv executing by "+Thread.currentThread().getName();
	}

}

class NameThread implements ThreadFactory
{
	int count=0;
	public Thread newThread(Runnable r)
	{
		count ++;
		return new Thread(r,"something - "+count);
	}


}