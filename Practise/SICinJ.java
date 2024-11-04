class P
{
	P()
	{
		System.out.println("Hey from P Constructor with out argument");
		
	}
	
	P(int x)
	{
		System.out.println("Hey from P constructor with int argument");
	}

	
	{
		System.out.println("I'm Instance Block of P class"); //Execute with every object creation of the class p
		System.out.println("Hello "); //Execute with every object creation of the class p
	}
	static{
		System.out.println("Hello to every one from Static block"); //Execute one time during classloading by classloader
	}

}

class C extends P
{


}


class SICinJ
{
	public static void main(String[] args)
	{
		new C(); //object creation
		new P(10); //object creation
	}

}