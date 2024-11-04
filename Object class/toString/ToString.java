class ToString
{

	public static void main(String[] args)
	{
		Car car1 =new Car("Morris Garage","Hector",25);
		System.out.println(car1);
	}
}
class Car
{
	String brand;
	String model;
	int price;
	
	Car(String brand,String model,int price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}

	public String toString()
	{
		return brand+"\n"+model+"\n"+price;
	}
}