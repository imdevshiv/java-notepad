/*There are 2 types of method 
i. Static Method
ii. Instances Method*/

class JMethod
{
	int x=10;
	static int y=20;
	public static void main(String[] args) //Main method
	{
		System.out.println("hey from main");
		JMethod jm = new JMethod();
		jm.m1();
		System.out.println("Instances Variable in main method "+jm.x);
		m3(); //we can directly call the static method in the main method 

	}
	public void m1()//Instances Method
	{
		System.out.println("hello from m1");
		System.out.println("Instances variable in m2 method "+x);
		m2();//we can directly call the instances method inside the instances method 
		
	}
	public void m2()//Instances Method
	{
		System.out.println("Hii from m2");
		JMethod.m3();
	}
	public static void m3()//Static Method
	{
		System.out.println("Java from m3");
	}

}