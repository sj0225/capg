package day6.com.capg;

import java.util.HashSet;

public class Myset {
	public static void main(String[] args) {
		 HashSet<String>set=new HashSet<String>();
	      set.add("s");
	      set.add("a");
	      set.add("g");
	      set.add("a");
	      set.add("r");
	      System.out.println(set);
	      Object[] arr=set.toArray();
	        System.out.println(arr.length);
	        for(Object obj:arr)
	        {
	            System.out.println((String)obj);
	        }
	        
	        
	        set.contains("s");
	        set.forEach(System.out::println);
	        
	        set.size();
	        

	}

}
