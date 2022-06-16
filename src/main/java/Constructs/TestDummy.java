package Constructs;

public class TestDummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "aa11b33";
		
		System.out.println(sumNumbers( str));
	}

	
	
	static public int sumNumbers(String str) {
		  
		  int sum=0;
		  String temp="";
		  
		  for(int i=0;i<str.length()-1;i++)
		  {
		    
		    if(  Character.isDigit(str.charAt(i)))
		    {
		      if( Character.isDigit(str.charAt(i+1)))
		      {
		      temp += str.charAt(i);
		      
		    }
		    else
		    {
		      temp += str.charAt(i);
		      sum +=Integer.parseInt(temp);
		      temp= "";
		    }
		  }
		  }
		  return sum;
		  
		}

}
