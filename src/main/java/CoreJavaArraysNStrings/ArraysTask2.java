package CoreJavaArraysNStrings;

public class ArraysTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Fing Biggest and smallest numbers of array
		
		int a[]= {2,5,4,8,9};
		
		findBiggest(a);
		findSmallest(a);
		
	}
	
	static void findBiggest(int a[])
	
	{
		int max=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
		
	}
	static void findSmallest(int a[])
	{
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}

}
