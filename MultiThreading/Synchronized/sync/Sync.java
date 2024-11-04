class Sync
{
	public static void main(String[] args)
	{
		Runnable r1=new Atm();
		Runnable r2=new Atm();
		Thread t1= new Thread(r1,"Shiv");
		Thread t2=new Thread(r2,"Ravi");
		t1.start();
		t2.start();
	}

}
class Atm implements Runnable
{
	public void run()
	{
		synchronized(Atm.class)
		{
			withdraw();
		}
	
	}
	public void withdraw()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Withdraw for "+Thread.currentThread().getName());
		
		}
	}

}