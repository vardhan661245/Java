package oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setcollections {

	public static void main(String[] args) {
         Set<String> s1=new HashSet<>();
         s1.add("Hi");
         s1.add("Hello");
         s1.add("good");
         s1.add("Hi");
         s1.add("Hello");
         s1.add("good");
         
//         List<String> li=new ArrayList<>(s1);
//         {
//        	 System.out.println(li);
//         }
//         
//         for(String s:s1)
//         {
//        	 System.out.println(s);
//         }
         Iterator<String> i1= s1.iterator();
         while(i1.hasNext())
         {
        	 System.out.println(i1.next());
         }
         
         
         
      
        		 
	}

}
