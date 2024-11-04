class JavaVariable2
{
	int x=10; //x is attribute of the class JavaVariable2
	int y;    //y is attribute of the class JavaVariable2
	static int z=20; //z is Attribute of the class JavaVariable2
	public static void main(String [] args)
	{
		int a=11;
		

		JavaVariable2 jv2 = new JavaVariable2();
		System.out.println(a +" This is local variable can be called directly");
		System.out.println(jv2.x +" This is instance variabale and called by an object of class");
		System.out.println(jv2.y+" This is instance variabale and called by an object of class");
		System.out.println(JavaVariable2.z+" This is Static variabale and called by className");//This is the right way to call a static variable
		System.out.println(jv2.z+" This is Static variabale and can be called by an object");
		System.out.println(z+" This is Static variabale and called directly");
	}
}