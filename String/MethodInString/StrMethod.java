class StrMethod
{
	public static void main(String[] args)
	{

		String n1="Shiv";
		String n2="shiv";
		System.out.println("**************String()***************");
		System.out.println("> n1==n2 : "+(n1==n2)+"\n> n1.equals(n2) : "+n1.equals(n2)+"\n> n1.equalsIgnoreCase(n2) : "+n1.equalsIgnoreCase(n2));
		
		String str="Shiv Sankar";
		char[] ch=str.toCharArray();

		for(char c:ch)
			System.out.println("> "+c);

		String[] str1=str.split(" ");
		for(String s:str1)
			System.out.println("> "+s);	
	}



}