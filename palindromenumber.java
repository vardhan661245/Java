package oops;

public class palindromenumber {

	public static void main(String[] args) {
         int num=1515;
        int b=num;
         int rev=0;
         while(num > 0)
         {
        	 rev=rev*10+num%10;
        	 num=num/10;
         }
//         if(b==rev)
//         {
//        	 System.out.println("palindrome");
//         }
//         else
//         {
//        	 System.out.println("not palindrome");
//         }
         System.out.println(rev);
	}

}
