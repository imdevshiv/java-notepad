interface I
{
	void m1();
	void m2();

}

class A implements I
{
	public void m1()
	{
		System.out.println("Hii");
	}
	public void m2()
	{
		System.out.println("Hello");
	}
	public void m3()
	{
		System.out.println("Rolex Sir");
	}

}

class InterfaceInAction
{
	public static void main(String[] args)
	{
		A a= new A();
		a.m1();
		a.m2();
		a.m3();
	}
}