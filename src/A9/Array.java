package A9;

public class Array 
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,20,30,40,50};
		
	
		for(int i=0; i<arr.length; i++)
		{
			boolean issorted=true;
			for(int j=0; j<arr.length; j++)
			{
				if(i !=j &&arr[i]==arr[j])
				{
					issorted=false;
					break;
				}
			}
			if(issorted)
			{
				System.out.println("The Array Unic Number : "+arr[i]);
			}

			

		}
			}
}
