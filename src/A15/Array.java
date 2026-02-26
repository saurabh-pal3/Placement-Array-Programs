package A15;

public class Array
{
	public static void main(String[] args)
	{
		int arr[]= {2,3,4,5,6,5,4,3,2};
	
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		
		for(int Element : arr)
		{
			if(Element !=-1)
			{
				System.out.println(Element +" \t");
			}
		}
		
	}

}
