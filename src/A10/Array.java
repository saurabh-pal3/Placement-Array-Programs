package A10;

public class Array
{
	public static void main(String[] args)
	{
		int n=5;
		int arr[]=  {1,2,4,5};
		
		int totlesum= n*(n+1)/2;  // 15
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		
		int missingElement=totlesum-sum;    //15-12=3
		
		System.out.println("Missing number: " + missingElement);
		
	}

}
