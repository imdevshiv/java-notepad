import java.io.*;

class ChekedE
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("D:\\Basant Technology\\JAVA\\Exception\\CheckedException\\SHIV.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Shiv");
		}
	}
}