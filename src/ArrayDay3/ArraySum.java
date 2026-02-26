package ArrayDay3;

public class ArraySum 
{
	public static void main(String[] args)
	{
		int target=9;
		int arr[]= {2,7,9,11,5,4};

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1 ; j<arr.length;j++)
			{
				if(arr[i] + arr[j]==target)
				{
					System.out.println(target+" Fount the sum of "+arr[i] +" + "+arr[j]);
				}
			}
		}
		
	}	

}
