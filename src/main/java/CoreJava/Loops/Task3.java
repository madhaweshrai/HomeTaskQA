package CoreJava.Loops;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Please enter number and x value");
		Scanner sc= new Scanner(System.in);
		  int num= sc.nextInt();
    	  int x= sc.nextInt();
		 
		  
		  //enter number=5 and x=3 
		  
		for(int i=1;i<=num;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print(x+" ");
					x=x+3;
				}
				
				
			}
			
			System.out.println(" ");
		}

	}

}
