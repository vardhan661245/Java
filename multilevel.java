package oops;
class grandfather
{
	void land()
	{
		System.out.println("land is 10 acres");
	}
}
class dad extends grandfather
{
	void gold()
	{
		System.out.println("gold is 2kg");
	}
}
class child extends dad
{
	void myself()
	{
		System.out.println("it is myself");
	}
}


public class multilevel extends child 
{

	public static void main(String[] args) 
	{
		multilevel m=new multilevel() ;
		m.land();
		m.gold();
		m.myself();
	}

}
