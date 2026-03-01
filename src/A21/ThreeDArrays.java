package A21;

public class ThreeDArrays
{
	public static void main(String[] args)
	{
		int arr[][][]= {
				{
					{1,2},
					{3,4}
				},
				{
					{5,6},
					{7,9}
				}
		};
				
		//iterating 3 loops
		
		for(int i=0; i<arr.length; i++)
		{
			 System.out.println("Layer " + i + ":");
			 
			 for(int j=0; j<arr[i].length; j++)
			 {
				 for(int k=0; k<arr[i][j].length; k++)
				 {
					 System.out.print(arr[i][j][k]+" ");
				 }
				 System.out.println();
			 }
			 System.out.println();
		}
		
	}

}
