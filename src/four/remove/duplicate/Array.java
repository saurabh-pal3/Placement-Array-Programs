package four.remove.duplicate;

public class Array
{
	public static void main(String[] args)
	{
		 
		int arr[]= {2,3,4,5,6,5,4,3,2};
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Dupicate Elemet: "+arr[j]);
				}
			}
		}
	}

}
