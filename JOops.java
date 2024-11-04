/*OOPS IN JAVA
1. DATA HIDING 
2. ABSTRACTION
3. ENCAPSULATION
4. INHERITANCE
5. [OLYMORPHISM
6. OBJECT
7. CLASS*/


class JOops
{
	public static void main(String[] args)
	{
		Abstraction a = new Abstraction();
		System.out.println("Example Of Abstraction");
		a.add(5,10);
		a.sub(10,5);
		
		System.out.println("Example of Encapsulation");
		JOops e = new JOops();
		int x=e.multi(9,6);
		System.out.println(x);

		System.out.println("Example of Polymorphism");
		e.p1();
		e.p1("Polymorphism");
		e.p1("java",8);		
	}

	public int multi(int a, int b)
	{
		int result=a*b;
		return result;
	}
	
	public void p1()
	{
		System.out.println("Hey from p1");
	}
	public void p1(String s)
	{
		System.out.println("Hello from "+s);
	}
	public void p1(String s,int a)
	{
		System.out.println("hii from "+s+" "+a);
	}

}

class Abstraction
{

	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void sub(int a, int b)
	{
	        int result=a-b;
		System.out.println(result);	
	}
}