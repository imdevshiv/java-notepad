import java.io.*;
class Try
{
	public static void main(String[] args) throws IOException
	{
		F f = new F();
		f.m1();
	}
}
class F
{
	public void m1() throws IOException
	{
		BufferedReader br=null;
		FileReader fr=null;
		try
		{
			fr=new FileReader(new File("D:\\Basant Technology\\JAVA\\try-with-resources\\shiv.txt"));
			br=new BufferedReader(fr);
			System.out.println(br.readLine());
		}
		finally
		{
			if(fr != null)
			{
				fr.close();
				System.out.println("fr.close()");
			}
			if(br != null)
			{
				br.close();
				System.out.println("br.close()");	

			}
			
		}
	}
}