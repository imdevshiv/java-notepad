class FinalizeMethod
{

	public static void main(String[] args)
	{
		A a =new A();
		a.m1();
		a.m2();
		a=null;
		System.gc();
		A a1 = new A();
		a1=null;
		Runtime.getRuntime().gc();
	}


}
class A
{
	public void m1()
	{
		System.out.println("Something");
	}
	public void m2()
	{
		System.out.println("Something");
	}
	public void finalize()
	{
		System.out.println("I will Execute before GarbageCollection ");
	}
}