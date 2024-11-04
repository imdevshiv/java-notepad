@FunctionalInterface
interface I
{
	void m1();
	public default void m2()
	{
		m1();
		System.out.println("Hello");
	}
	public static void m3()
	{
		System.out.println("Hey-from I");
	}
}
@FunctionalInterface
interface I2 extends I
{
	public static void m3()
	{
		I2 i = ()->System.out.println("php");//lamda Expression
		i.m2();
		System.out.println("Hey-from I2");
	}
}
class Fj
{
	public void main()
	{
	
	}
	public static void main(String[] args)
	{
		Fj i=new Fj();
		I m=i::main;
		m.m2();
		m.m1();
		I.m3();
		I2.m3();
	}	
}