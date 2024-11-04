class SSB
{
	public static void main(String[] args)
	{
		System.out.println("-------- STRING Literal-----------");
		String s1="Shiv";
		String s2="Shiv";
		s1.concat("Sankar");
		System.out.println(s1);
		System.out.println(">In this case  s1 == s2 (true) because both are literal and store in same location and .equal (true) method is overriden in String class"+"\n"+(s1==s2));
		System.out.println(s1.equals(s2));
		
		System.out.println("-------- STRING Object-----------");

		String s3=new String("Shiv");
		String s4=new String("Shiv");
		System.out.println(">In this case s3 == s4 (false) because both are two different obj and .equals method (true) cause equals is overriden in String class ");
		System.out.println((s3==s4)+"\n"+s3.equals(s4));
		
		System.out.println("-------- STRINGBUFFER Object-----------");

		StringBuffer sb1= new StringBuffer("Shiv");
		StringBuffer sb2=new StringBuffer("Shiv");
		System.out.println(">In this case sb1 == sb2 (false) because both are two different obj and .equals method (false) cause equals is not overriden in StringBuffer class ");
		System.out.println((sb1==sb2) +"\n"+(s1.equals(sb2)));
		sb1.append(" Sankar");
		System.out.println(sb1);
	
	}
}