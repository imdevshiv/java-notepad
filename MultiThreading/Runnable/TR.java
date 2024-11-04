class TR implements Runnable
{
	public static void main(String[] args)
	{
		TR tr=new TR();
		Thread t=new Thread(tr);	
		t.setName("Agent-007");
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Running...."+Thread.currentThread().getName());

		}
		System.out.println("close "+Thread.currentThread().getName());
	}
	
	public void run()
	{
		int i=0;
		while(i<10)
		{
			System.out.println("SomeThing to run "+Thread.currentThread().getName());
			i++;
		}
		System.out.println("Mission completed by "+Thread.currentThread().getName());
	}
}