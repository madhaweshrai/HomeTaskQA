package CoreJava.Loops;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter number and x value");
		Scanner sc= new Scanner(System.in);
		  int num= sc.nextInt();
    	  int x= sc.nextInt();
		  
		
		
		  int row=1,column=1;
		
		  do{
	
		  column=1;
		  do{
			  

          	if(row==1)
          	{
          		System.out.print("0");
          		
          	}
          	
          	else
          	{
          		 System.out.print(x+" ");
          		 x=x+2;
          		
          	}
          	 column++;
		  //System.out.print("*"+" ");
		 // column++;
		  }while(column<=row);
		  System.out.println(" ");
		  row++;
		  }while (row<=num);
		  }

	

}
