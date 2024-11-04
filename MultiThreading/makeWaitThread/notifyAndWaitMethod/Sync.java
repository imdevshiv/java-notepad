class Sync 
{
	public static void main(String[] args)
	{
		Runnable r1=new Atm();
		Runnable r2=new Deposit((Atm)r1);

		Thread t1=new Thread(r1,"Thread -p1");
		Thread t2=new Thread(r1,"Thread-p2");
		Thread t3=new Thread(r2,"Thread-deposit");
		
		t1.start();
		t2.start();
		t3.start();
	
	}
}
class Atm implements Runnable
{
	private boolean flag=false;
	public synchronized void run()
	{
		withdraw();	
	}
	public void withdraw()
	{
		synchronized(Atm.class)
		{
			for(int i=0;i<10;i++)
			{ 
				if(i==5 && !flag)
				{
					try
					{
						
						Atm.class.wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println("Withdraw for "+Thread.currentThread().getName()+" "+i+"time");
			}
		}
	}
	public void deposit()
	{
		synchronized(Atm.class)
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Deposit "+Thread.currentThread().getName()+" "+i+"time");
			}
			Atm.class.notifyAll();
		}
		
	}
	public void setFlag()
	{
		flag=true;
	}
}
class Deposit implements Runnable
{
	Atm atm;
	Deposit(Atm atm)
	{
		this.atm=atm;	
	}
	
	public synchronized void run()
	{
			atm.deposit();
			atm.setFlag();
		
	}

}
