package oops;

import java.util.ArrayList;
import java.util.List;

public class listcollections {

	public static void main(String[] args) {
       List<Integer> li= new ArrayList<>();
       li.add(10);
       li.add(100);
       li.add(1000);
       li.add(10);
       li.add(100);
       li.add(1000);
    for(int i=0;i<li.size();i++)
    {
    	System.out.println(li.get(i));
    }
    
    for(int i:li)
    {
    	System.out.println(i);
    }
       
	}

}
