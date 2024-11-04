class Custom
{
	public static void main(String[] args) throws UserNotFoundException //to handel checked exception
	{
		Validator v = new Validator();
		v.validate(10,0);
		v.validate(20,0);	
	}
}

class Validator
{
	public void validate(int uId,int income) throws UserNotFoundException //to handel checked exception
	{
		if(uId == 10)
		{
			if(income>0)
			{
				System.out.println("Welcome Admin");

			}
			else
			{
				throw new IncomeException("Admin Income can't be 0");//unchecked Exception
			}
		}
		else
		{
			throw new UserNotFoundException("User Not Found");
		}
	}

}
class UserNotFoundException extends Exception //checked Exception
{
	UserNotFoundException(String message)
	{
		super(message);
	}
}
class IncomeException extends RuntimeException //unchecked Exception
{
	IncomeException(String message)
	{
		super(message);
	}
}