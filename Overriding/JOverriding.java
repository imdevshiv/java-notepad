class JOverriding
{
	public static void main(String[] args)
	{
		
		P p=new P();
		p.p1();
		p.p2();
		
		C c=new C();
		c.p1();
		c.p2();
		c.p3();

	}

}

class P
{

	public void p1()
	{
		System.out.println("HELLO FROM P");
	}
	public void p2()
	{
		System.out.println("> P p2() : I'm Alive");
	}

}

class C extends P
{
	public void p2()
	{
		
		System.out.println("I'm Dead"); //overriding p2()
		super.p2();
	}
	public void p3()
	{
		System.out.println("HII FROM C");
	}
						
}