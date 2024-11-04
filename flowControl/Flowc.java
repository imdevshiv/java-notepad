import java.util.Scanner;

class Flowc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n 1 for left sift \n 2 for right shift");
		int input=sc.nextInt();
		if(input!=1 && input!=2)
		{
			throw new CustomException("Not a valid selection");
		}
		System.out.println("Enter a number to perform operation ");
		int num=sc.nextInt();
		System.out.println("Enter a number to time ");
		int time=sc.nextInt();

		switch(input)
		{
			case 1:
				System.out.println(num+"<< = "+(num<<time));
				break;
			case 2:
				System.out.println(num+">> = "+(num>>time));
				break;
			default:
				System.out.println("Invalid Choice");
		}
	
	}

}
class CustomException extends RuntimeException
{
	CustomException(String msg)
	{
		super(msg);
	}

}