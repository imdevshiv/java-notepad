class JavaVariable
{
	static int z=30; //static variable
	int y = 20;      //instance variable
	public static void main(String[] args)
	{
		int x=10; //local variable
		System.out.println(x);
		JavaVariable jv = new JavaVariable(); //object creation
		System.out.println(jv.y);
		System.out.println(JavaVariable.z);
	}
}