//package oops;
//class fruits
//{
//	public void mango()
//	{
//		System.out.println("The mango cost is 50");
//	}
//	public void apple()
//	{
//		System.out.println("The apple cost is 100");
//	}
//	public void papaya()
//	{
//		System.out.println("The papaya cost  is 120");
//	}
//}
//
//public class overriding extends fruits 
//{
//	  public void mango()
//	  {
//		  System.out.println("The mango cost is 100");
//	  }
//	  public void apple()
//	  {
//		  System.out.println("The apple cost is 150");
//	  }
//	  public void dragonfruit()
//	  {
//		  System.out.println("The dragonfruit cost is 200");
//	  }
//
//	public static void main(String[] args) 
//	{
//         overriding o1 =new overriding();
//         o1.mango();   
//         o1.apple();
//         o1.papaya();
//         o1.dragonfruit();
//	}
//
//}
package oops;

import java.util.Scanner;

public class CarManufacturing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values: T = Tyres, C = Chassis, S = Seats
        int T = scanner.nextInt();
        int C = scanner.nextInt();
        int S = scanner.nextInt();

        scanner.close();

        // A car requires 4 tyres, 1 chassis, and 2 seats
        int carsPossible = Math.min(T / 4, Math.min(C, S / 2));

        // Print the number of cars that can be manufactured
        System.out.println(carsPossible);
    }
}

