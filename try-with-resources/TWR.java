import java.io.*;
class TWR
{
	public static void main(String[] args)
	{
		readTxt();
	
	}
	public static void readTxt()
	{
		try(BufferedReader br = new BufferedReader(new FileReader(new File("D:\\Basant Technology\\JAVA\\try-with-resources\\shivv.txt"))))
		{
			System.out.println(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}


}