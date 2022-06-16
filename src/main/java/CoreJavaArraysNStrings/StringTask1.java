package CoreJavaArraysNStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a program to Print duplicate characters from String 
		
		String s="madhaweshrai";
		 char arr[]= s.toCharArray();
		 
		 Map<Character,Integer> map= new HashMap<Character,Integer>();
		 
		  for(Character a:arr)
		  {
                    Integer count=map.get(a);
                     if(count ==null)
                     {
                    	 map.put(a, 1);
                     }
                     else
                     {
                    	 map.put(a, ++count);
                    	 
                     }
		 

	       }
		  
		 Set<Entry<Character,Integer>> set=  map.entrySet();
		  for(Entry<Character,Integer> snew:set )
		  {
			   if(snew.getValue()>1)
			   {
				   
				   System.out.println(snew.getKey());
			   }
		  }
	}

}
