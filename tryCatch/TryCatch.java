class TryCatch
{
	public static void main(String[] args)
	{
		TryCatch tc=new TryCatch();
		tc.m1();
	}
	void m1()
	{
		m2();
	}
	void m2()
	{
		m3();
	}
	void m3()
	{
		System.out.println(" " +10/2);
		System.out.println(" " +20/2);
		try
		{
			System.out.println(" " +30/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(" " +e);
			System.out.println(" " +30/2);
		}
		System.out.println(" " +40/2);

	}
}