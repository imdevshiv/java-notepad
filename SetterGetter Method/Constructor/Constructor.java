class Constructor
{

	public static void main(String [] args)
	{
		System.out.println("--------PRINT DETAIL OF CAR--------");
		Car c1=new Car("MG-HACTOR",23.4,"Black","Nithish");	
		Car c2=new Car("AUDI-A6",70.41,"WHITE","BALAJI");	
		Car c3=new Car("TOYOTA-SUPRA-MK4",90.3,"YELLOW","SHIV");

		c1.printDetail();
		System.out.println("----------------");
		c2.printDetail();
		System.out.println("----------------");
		c3.printDetail();	


	}
}

class Car
{
	String cName;
	double price;
	String color;
	String owner;

	Car(String cName,double price,String color,String owner)
	{
		 this.cName=cName;
	         this.price=price;
	         this.color=color;
	         this.owner=owner;
	}
	
	public void printDetail()
	{
		System.out.println("Owner :"+owner);
		System.out.println("Car Name :"+cName);
		System.out.println("Price :"+price+"L");
		System.out.println("Color :"+color);
	}
}