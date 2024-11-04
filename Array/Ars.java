class Ars
{
	public static void main(String[] args)
	{
		int[] a={1,2,3};
		char[] b={'a','b','c'};
		String[] c={"Shiv","Sankar"};
		
		System.out.println("**********INT[]************");
		for(int i:a)
		{
			System.out.print(i+",");
		}
		System.out.println("\n"+a+"\nCLASS NAME : "+a.getClass().getName());
		System.out.println("**********CHAR[]************");
		for(char i:b)
		{
			System.out.print(i+",");
		}
		System.out.println("\n"+b+"\nCLASS NAME : "+b.getClass().getName());
		System.out.println("**********STRING[]************");
		for(String i:c)
		{
			System.out.print(i+",");
		}
		System.out.println("\n"+c+"\nCLASS NAME : "+c.getClass().getName());

		System.out.println("**********2-D[]************");
		int[][] ars={{3,4,5},{8,4,5}};
		for(int[] i:ars)
		{
			for(int j:i)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println("**********3-D[]************");
		int[][][] ars3={{{1,2},{3,4}},{{5,6},{7,8}}};
		for(int[][] i:ars3)
		{
			for(int[] j:i)
			{
				for(int k:j)
				{
					System.out.print(" "+k);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}


}