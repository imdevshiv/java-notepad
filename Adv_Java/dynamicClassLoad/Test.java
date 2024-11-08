class Test
{
	public static void main(String[] args) throws Exception
	{
		String className=args[0];
		Class clazz=Class.forName(className);
		I i=(I) clazz.newInstance();
		i.m1();
	}
}
