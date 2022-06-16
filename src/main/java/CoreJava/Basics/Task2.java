package CoreJava.Basics;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // stores two numbers
        double num1, num2;
  
        // Take input from the user
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
  
        // take the inputs
        num1 = sc.nextDouble();
  
        num2 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/,%)");
  
        char op = sc.next().charAt(0);
  
        double output = 0;
  
        switch (op) {
  
        // case to add two numbers
        case '+':
  
        	output = num1 + num2;
  
            break;
  
        // case to subtract two numbers
        case '-':
  
        	output = num1 - num2;
  
            break;
  
        // case to multiply two numbers
        case '*':
  
        	output = num1 * num2;
  
            break;
  
        // case to divide two numbers
        case '/':
  
        	output = num1 / num2;
  
            break;
        case '%':
        	  
        	output = num1 % num2;
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }
        
        System.out.println(num1 + " " + op + " " + num2
                + " = " + output);

	}

}
