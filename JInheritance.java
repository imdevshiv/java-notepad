class JInheritance
{
	public static void main(String[] args)
	{
		System.out.println("Lets see Inheritances in action");
		System.out.println("We are Parent calss method");
		Parent p = new Parent();
		p.p1();
		p.p2();

		System.out.println("Child class can acess parent class method p1 and p2 also");
		Child c = new Child();
		c.c1();
		c.p1();
		c.p2();

		System.out.println("Child class can be called with Parent class type");
		Parent pc=new Child();
		pc.c1();
		pc.p1();
		pc.p2();	
	}
}

class Parent
{
	public void p1()
	{
		System.out.println("Hii from Parent P1");
	}
	
	public void p2()
	{
		System.out.println("Hii from Parent p2");
	}
}

class Child extends Parent
{
	 public void c1()
	 {
		System.out.println("Hello I'm c1 from Child class");
	 }
}