class CT
{

	public static void main(String[] args)throws InterruptedException
	{
		Runnable r=()->
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("running by "+Thread.currentThread().getName());
					try{Thread.sleep(2000);}catch(InterruptedException e){}
				}
	
			};
		Runnable r1=()->
				
			{	for(int i=0;i<5;i++)
				{
					try{Thread.sleep(1000);}catch(InterruptedException e){}
					System.out.println("Running by "+Thread.currentThread().getName());
				}
			};

		Thread t1=new Thread(r,"Thread-1");
		Thread t2=new Thread(r1,"Thread-2");
		t1.start();
		t2.start();
		t1.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Waiting for rest to execute by "+Thread.currentThread().getName());
	
		}
		System.out.println(t1.getName()+" is Alive "+t1.isAlive());
		System.out.println(t2.getName()+" is Alive "+t2.isAlive());
	}



}