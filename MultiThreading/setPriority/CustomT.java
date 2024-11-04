class CustomT implements Runnable
{
	public static void main(String[] args)
	{
		Thread threadName=Thread.currentThread();
		threadName.setName("Agent 001");

		Runnable r=new CustomT();
		Thread t = new Thread(r);
		t.setName("Agent 007");
		t.setPriority(7);
		t.start();

		threadName.setPriority(1);
		for(int i=0;i<10;i++)
		{
			System.out.println("Working.... by "+threadName.getName()+" priority is "+threadName.getPriority());
		}
		System.out.println("Working Completed by "+threadName.getName()+" priority is "+threadName.getPriority());
	
	}
	public void run()
	{
		int i=0;
		while(i<10)
		{
			System.out.println("Running.... by "+Thread.currentThread().getName()+" priority is  "+Thread.currentThread().getPriority());
			i++;
		}
		System.out.println("Running Done by "+Thread.currentThread().getName()+" priority is  "+Thread.currentThread().getPriority());
	}

}