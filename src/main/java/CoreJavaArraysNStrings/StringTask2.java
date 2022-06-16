package CoreJavaArraysNStrings;

public class StringTask2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to check if two strings are rotations of each other 
		
   String s1="madam";
   String s2="madam";
   String rev="";
   
     for(int i=s1.length()-1;i>=0;i--)
     {
    	 rev = rev+ s1.charAt(i);
    	 
     }
  //   System.out.println(rev);
     
     if(rev.equalsIgnoreCase(s2))
     {
    	 
    	 System.out.println("Strings are rotational");
     }
     else
     {
    	 System.out.println("Non rotational");
     }
   
	}

}
