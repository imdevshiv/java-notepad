class WCFe
{
	public static void main(String[] args)
	{
		System.out.println("************************");
		Integer i=10; //AUTO BOXING
		Integer i2=Integer.valueOf(i);
		System.out.printf("i=%d || i2=%d \ni==i2 is %B\n",i,i2,(i==i2));

		System.out.println("************************");
		i=200;
		i2=Integer.valueOf(i);
		System.out.printf("i=%d || i2=%d \ni==i2 is %B\n",i,i2,(i==i2));

		System.out.println("***********HEX TO DECI*************");
		Integer hex=Integer.valueOf("F",16);
		System.out.printf("(F)16 is (%d)10\n",hex);

		System.out.println("***********CONVERTING OBJ TO INT*************");
		int x=i;//Auto Unboxing
		int x1=i2.intValue();
		System.out.printf("x=%d || x1=%d\n",x,x1);

	}


}