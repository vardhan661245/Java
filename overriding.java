package oops;
class bike
{
	void speed()
	{
		System.out.println("The speed is 120");
	}
	void gears()
	{
		System.out.println("The bike has 4 gears");
	}
	void brake()
	{
		System.out.println("The bike has brakes");
	}
}

public class overriding extends bike 
{
      void speed()
      {
    	  System.out.println("The speed is 150");
      }
      void gears()
  	 {
  		System.out.println("The bike has 5 gears");
  	 }
      void color()
      {
    	  System.out.println("The bike color is black");
      }
      
	public static void main(String[] args)
	{
		overriding o=new overriding();
		o.speed();
		o.gears();
		o.brake();
		o.color();
       
	}

}
