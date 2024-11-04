class CustomThread
{
	public static void main(String[] args)
	{
		T t=new T();
		t.start();
		t.setName("cThread");
		for(int i=0;i<=10;i++)
		{
			System.out.println("Something executed by : "+Thread.currentThread().getName());

		}
		System.out.println(Thread.currentThread().getName()+"End");
	}


}

class T extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Nothing executed by : "+Thread.currentThread().getName());

		}
		System.out.println(Thread.currentThread().getName()+"End");
	}

}