class Constructor
{
	public static void main(String[] args)
	{
		C c = new C();	
	} 
}

class P
{
	P(String s)
	{
		System.out.println("I will be printed first");
	}

}
class C extends P
{
	C()
	{
		this("Go to C constructor with String argument");
		System.out.println("I'm getting printed last");
		
	}
	
	C(String s)
	{
		super("let me call parent class P constructor with string argument");
		System.out.println("I will be printed 2nd");
	
	}


}