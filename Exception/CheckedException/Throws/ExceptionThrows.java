import java.io.*;
class ExceptionThrows
{
	public static void main(String[] args)throws IOException
	{
		ExceptionThrows et=new ExceptionThrows();
		et.m1();
	}
	public void m1()throws IOException
	{
		m2();
	}
	public void m2()throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(new File("D:\\Basant Technology\\JAVA\\Exception\\CheckedException\\Throws\\shi.txt")));
		System.out.println(br.readLine());
	}

}