class SThread
{
	public static void main(String[] args) throws Exception
	{
		Runnable r1=new Runnable()
			{
				synchronized public void run()
				{
					for(int i=0;i<5;i++)
					{
						System.out.println("hello "+i+"time "+Thread.currentThread().getName());
					}
					System.out.println("***********************************");
					
				}
			};
		System.out.println("***********************************");
		Thread t1=new Thread(r1,"SynchronizedThread-1");
		Thread t2=new Thread(r1,"SynchronizedThread-2");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		Thread mainT=Thread.currentThread();
		Runnable r2=()->
			{
				System.out.println("***************DeadLock******************");
				try{
					mainT.join();
					System.out.println("***************Something******************");
				}
				catch(Exception e){}
					
			};
		Thread t3=new Thread(r2,"DeadLockThead");
		t3.start();
		for(int i=0;i<5;i++)
		{
			t3.join();
			System.out.println("hello "+i+"time "+Thread.currentThread().getName());
		}
	}

}

