package CoreJava.Loops;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		Enter Number:
			5
			Enter X:
			1
			 
			0	
			1	2	
			3	4	5	
			6	7	8	9	
			10	11	12	13	14*/
		System.out.println("Please enter number and x value");
		Scanner sc= new Scanner(System.in);
		  int num= sc.nextInt();
    	  int x= sc.nextInt();
		  int i=1; 
		
		
		//enter num=5 and x=1 
		while(i <= num)
        {
			int j=1;
            while(j <= i)
            {
            	
            	
            	if(i==1)
            	{
            		System.out.print("0");
            		
            	}
            	
            	else
            	{
            		 System.out.print(x+" ");
            		 x=x+1;
            		 
            	}
            	j++;

            }
            System.out.println(" ");
            i++;

        }
	}

}
