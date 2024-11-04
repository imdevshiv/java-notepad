class FinallyBlock
{
	public static void main(String[] args)
	{
		
		try
		{
			System.out.println(30/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something to handel the Exception");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I will Execute no matter what happen to code");
		}
	}

}