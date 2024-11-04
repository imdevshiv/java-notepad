import java.lang.reflect.*;
class GClass
{
	public static void main(String[] args)
	{
		for(int i=0;i<=50;i++)
		{
			System.out.print("*");
		}
		System.out.println("");

		A a = new A();
		Class aclass=a.getClass();
		System.out.println("Class aclass=a.getClass() in this 'aclass'="+aclass);
		System.out.println("Get class name : "+aclass.getName());
		
		Class oclass = Object.class;
		System.out.println("'Class refVariable=ClassName.class' is Another way to get class detail = "+oclass);
		System.out.println("Get class name : "+oclass.getName());
		
		for(int i=0;i<=50;i++)
		{
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.println("To get Declared Method .getDeclaredMethods() will return an array of methods");
		Method[] methods = aclass.getDeclaredMethods();
		for(Method method:methods)
		{
			System.out.println("MethodName :"+method.getName()+" return type "+method.getReturnType()+" hashCode@"+method.hashCode());
		}

		System.out.println("");
		System.out.println("To get Declared Constructors .getDeclaredConstructors() will return an array of constructors");
		
		Constructor[] constructor = aclass.getDeclaredConstructors();
		for(Constructor c: constructor)
		{
			System.out.println("ConstructorName :"+c.getName()+" hasCode @"+c.hashCode());
		}
		
		
	}
}
class A
{
	A()
	{}
	public void m1()
	{
		
	}
	public int m2()
	{
		return 0;
	}
	static double m3()
	{
		return 0;
	}
	
}
