import java.util.*;
class HashCollison
{
	public static void main(String[] args)
	{
		Integer s1=Integer.valueOf(65);
		Character s2=Character.valueOf('A');
		int h1=s1.hashCode();
		int h2=s2.hashCode();
		System.out.println("h1 hashCode="+h1+" h2 hashCode="+h2+" h1.equals(h2)"+s1.equals(s2));
		System.out.println("s1 key Index will be "+(h1 & (16-1)));
		
		System.out.println("s2 key Index will be "+(h2 & (16-1)));
		HashMap map=new HashMap();
		map.put(s1,"Hey");
		map.put(s2,"Hello");
		System.out.println(map);
		//System.out.println(map.get(s1));
		
		
	}
}