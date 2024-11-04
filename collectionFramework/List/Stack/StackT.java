import java.util.*;
class StackT
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<>();
		for(int i=10;i<51;i+=10)
		{
			s.push(i);
		}
		System.out.println(s);
		for(int i=0;i<5;i++)
		{
			System.out.println("Delete->"+s.pop());
			System.out.println(s);
			if(!s.isEmpty())
			{
				System.out.println("Top->"+s.peek());
			}
				
		}
		
	}
}