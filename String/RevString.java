class RevString
{
	public static void main(String[] args)
	{
		RevString rs =new RevString();
		String s="Shiv";
		System.out.println("------------REVERSE A GIVEN String---------------- \n> "+(s));
		rs.reverseMethod(s);
		rs.revWithFor(s);
	}
	public void reverseMethod(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		System.out.println("> Reverse a String with reverse() \n"+(sb));
	}
	public void revWithFor(String s)
	{
		// String r = "";
		StringBuffer r =new StringBuffer("");
		for(int i = s.length()-1;i>=0;i--)
		{
			r=r.append(s.charAt(i));	
		}
		System.out.println("> Reverse a String without reverse() \n"+(r));
	}


}