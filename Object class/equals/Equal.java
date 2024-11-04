class Equal
{
	public static void main(String[] args)
	{
		String s1 = new String("Shiv");
		String s2 = new String("Shiv");
		System.out.println("s1 "+s1+"\ns2 "+s2);
	
		System.out.println(s1==s2); //== is used to check between referance of object
		System.out.println("s1.equals(s2) is "+s1.equals(s2)); //.equals(Object obj) is used to check the content
		
		String n="Shiv";
		System.out.println(n.equals(s2));

		A a1 = new A("Shiv");
		A a2 = new A("Shiv");
		System.out.println(a1.name.equals(a2.name));
		
	}
}

class A
{
	String name;
	A(String name)
	{
		this.name=name;
		
	}
	
}