package oops;
interface rbi
{
	public abstract void deposit();
	public abstract void withdraw();
	
}
interface bank
{
	public abstract void amount();
	public abstract void registered();
}

public class abstraction implements rbi,bank
{
  
	public void amount() 
	{
         System.out.println("The amount is 100000");		
	}

	@Override
	public void registered() 
	{
           System.out.println("The registration is successful");	
	}

	@Override
	public void deposit() 
	{
          System.out.println("The amount is deposited");		
	}

	@Override
	public void withdraw() 
	{
		System.out.println("The amount was withdraw");
		
	}
	public static void main(String[] args)
	{
		abstraction a=new abstraction();
		a.amount();
		a.registered();
		a.deposit();
		a.withdraw();
	}
	

}
