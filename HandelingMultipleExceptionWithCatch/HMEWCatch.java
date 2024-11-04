import java.io.*;
class HMEWCatch
{

	public static void main(String[] args)
	{	
		try(A a = new A();BufferedReader br=new BufferedReader(new FileReader(new File("D:\\Basant Technology\\JAVA\\try-with-resources\\siv.txt"))))
		{
			System.out.println(br.readLine());
			a.m1();
			int x=2/0;
		}
		catch(IOException |ArithmeticException e)
		{
			System.out.println("Exception");
		}
	}

}
class A implements AutoCloseable
{
 	public void m1()
	{
		System.out.println("Something");
	}
	public void close()
	{
		System.out.println("close");
	}
}