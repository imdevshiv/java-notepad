class NEquals
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp("Shiv");
		Emp e2 = new Emp("Shiv");
		System.out.println(e1.name.equals(e2.name));
		System.out.println(e1.equal(e2));

		Emp e3 = new Emp("Aviii");
		System.out.println(e1.name.equals(e3.name));
		System.out.println(e1.equal(e3));
		
	}

}
class Emp
{
	String name;
	Emp(String name)
	{
		this.name=name;
	}
	public boolean equal(Emp e)
	{
		return (name==e.name);
	}
}