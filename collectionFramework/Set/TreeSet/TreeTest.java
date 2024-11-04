import java.util.*;
class TreeTest
{
	public static void main(String[] args)
	{
		/*TreeSet<Integer> t=new TreeSet<>((i1,i2)->i2-i1);*/
		TreeSet<Integer> t=new TreeSet<>(new CC());
		t.add(50);
		t.add(60);
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(100);
		System.out.println(t);

		TreeSet<String> ts=new TreeSet<>((s1,s2)->s2.compareTo(s1));
		ts.add("Moon Knight");
		ts.add("DeadPool");
		ts.add("Hulk");
		ts.add("Iron Man");
		System.out.println(ts);
	}


}
class CC implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i2-i1;
	}
}