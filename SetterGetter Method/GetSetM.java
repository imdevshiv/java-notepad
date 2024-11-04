class GetSetM
{
	public static void main(String[] args)
	{
		System.out.println("---------PRINT STUDENT DETAIL-----------");			

		Student s1=new Student();
		Student s2=new Student();	
		Student s3=new Student();	
		Student s4=new Student();

		s1.setSName("Nithish");
		s1.setSId(7);
		s1.setSCourseName("JavaFullStack");
		s1.setSPno("6382746046");	

		s2.setSName("Balaji");
		s2.setSId(8);
		s2.setSCourseName("JavaFullStack");
		s2.setSPno("7708669117");

		s3.setSName("Shiv");
		s3.setSId(9);
		s3.setSCourseName("JavaFullStack");
		s3.setSPno("9692913336");
		
		System.out.println(s1.getSId());
		System.out.println(s1.getSName());
		System.out.println(s1.getSCourseName());
		System.out.println(s1.getSPno());
		
		System.out.println("---------------------------");			

		System.out.println(s2.getSId());
		System.out.println(s2.getSName());
		System.out.println(s2.getSCourseName());
		System.out.println(s2.getSPno());
	
		System.out.println("---------------------------");			

		System.out.println(s3.getSId());
		System.out.println(s3.getSName());
		System.out.println(s3.getSCourseName());
		System.out.println(s3.getSPno());
	}

}
class Student
{
	int sId;
	String sName;
	String sCourseName;
	String sPno;

	public void setSId(int sId)
	{
		this.sId=sId;
	}

	public void setSName(String sName)
	{
		this.sName=sName;
	}

	public void setSCourseName(String sCourseName)
	{
		this.sCourseName=sCourseName;
	}

	public void setSPno(String sPno)
	{
		this.sPno=sPno;
	}

	public int getSId()
	{
		return sId;
	}

	public String getSName()
	{
		return sName;
	}
	
	public String getSCourseName()
	{
		return sCourseName;
	}
	
	public String getSPno()
	{
		return sPno;
	}

}