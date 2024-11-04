class WClass
{
	public static void main(String[] args)
	{
		Short s=new Short((short)1);
		Short s1=new Short("1");
		Byte b=new Byte((byte)7);
		Byte b1=new Byte("7");
		Integer i=new Integer(10);
		Integer i1=new Integer("10");

		Character c=new Character('S');

		Long l=new Long(10L);
		Float f=new Float(10.0f);
		Double d=new Double(20);
		
		Boolean bool=new Boolean("BBS");
		Boolean bool1=new Boolean("CTC");

		System.out.println("*****************Wrapper Class**********************");
		System.out.println(">Short\n s: "+s+" || s1: "+s1);
		System.out.println(">Byte\n b: "+b+" || b1: "+s1);
		System.out.println(">Integer\n i: "+s+" || i1: "+i1);
		System.out.println(">Character\n c: "+c);
		System.out.println(">Long\n l:"+l);
		System.out.println(">Float\n f:"+f);
		System.out.println(">Double\n d:"+d);
		System.out.println(">Boolean\n bool:"+bool+" || bool1: "+bool1+" || bool==bool1: "+(bool==bool1)+" || bool.equals(bool1): "+bool.equals(bool1));
	}

}