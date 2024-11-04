class Student implements Cloneable
{
	int rollNo;
	String name;
	Student()
	{
	}
	Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public String toString()
	{
		return "Roll No: "+rollNo+"\n"+"Name: "+name;
	}
}

class SDclone
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s1= new Student(1,"Shiv");
		Student s2=s1; //Shallow Clone or copy

		System.out.println(s1+"\ns1 hashCode: "+s1.hashCode()+"\n"+s2+"\ns2 hashCode: "+s2.hashCode());
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("..............................");

		Student s3= new  Student(s1.getRollNo(),s1.getName()); //Deep clone or copy
		System.out.println(s1+"\ns1 hashCode: "+s1.hashCode()+"\n"+s3+"\ns3 hashCode: "+s3.hashCode());
		System.out.println("s1==s3 "+(s1==s3));

		System.out.println("..............................");
		
		Student s4=(Student)s1.clone();
		s4.setName("Avii"); 
		System.out.println(s1+"\ns1 hashCode: "+s1.hashCode()+"\n"+s4+"\ns4 hashCode: "+s4.hashCode()+"\ns1==s4 "+(s1==s4));

	}
}