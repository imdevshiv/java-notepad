import java.util.*;
import java.lang.reflect.*; //Method class is part of reflect(package)
class AList
{
	public static void main(String[] args)
	{
		ArrayList<String> als=new ArrayList<>();
		als.add("Collection(I)");
		als.add("List(I)");
		als.add("ArrayList(C)");
		System.out.println("	Records in ALS \n	"+als+"\n");
		System.out.println(" Method present in ArrayList");
		int count=0;
		Method[] m= als.getClass().getDeclaredMethods();
		for(Method i:m)
		{
			count++;
			System.out.print(count+". "+i.getName()+" ");
		}
		System.out.println("\nTotal Method present in ArrayList : "+count);
		
	}
}