package oops;

public class palindromestring {

	public static void main(String[] args) {
         String s="radar";
         String rev="";
         for(int i=s.length()-1;i>=0;i--)
         {
        	 rev=rev+s.charAt(i);
         }
         if(s.equals(rev))
         {
        	 System.out.println("palindrome string");
         }
         else
         {
        	 System.out.println("not palindrome string");
         }
	}

}
