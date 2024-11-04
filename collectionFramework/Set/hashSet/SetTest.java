import java.util.*;
class SetTest
{
	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		h.add(10);
		h.add('a');
		h.add("Shiv");
		System.out.println(h.add(10));
		System.out.println("HashSet Element: "+h);
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(10);
		lh.add('a');
		lh.add("Shiv");
		System.out.println(lh.add(10));
		System.out.println("LinkedHashSet Element: "+lh);

		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(50);
		ts.add(90);
		ts.add(30);
		System.out.println("TreeSet Elements: "+ts);
		
		
	}
}