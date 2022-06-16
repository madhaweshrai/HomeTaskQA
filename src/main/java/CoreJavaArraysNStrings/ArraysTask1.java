package CoreJavaArraysNStrings;

public class ArraysTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[100];
		
		for(int i=0;i<=99;i++)
		{
			arr[i]=i+2;
			System.out.println(arr[i]);
		}
		

		
		findmissing(arr);

	}
	
	static void findmissing(int arr[])
	{

		int sum = 0;
		int idx = -1;
		for (int i = 0; i < arr.length-1; i++)
		{
		   
		         sum += arr[i];
		    
		}

		// the total sum of numbers between 1 and arr.length.
		int total = (arr.length + 1) * arr.length / 2;

		System.out.println("missing number is: " + (total - sum) );
		
	}

}
