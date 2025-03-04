package oops;

public class overloading 
{    
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void multi(int a ,int b)
	{
		System.out.println(a*b);
	}
	void add(String a, String b)
	{
		System.out.println(a+b);
	}
	 

	public static void main(String[] args)
	{
		overloading o=new overloading ();
		o.add(4, 5);
		o.multi(4, 5);
		o.add("vijay", "vishnu");
	}

}
