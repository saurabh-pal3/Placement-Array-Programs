package A17;
public class SerchElement
{
	public static boolean searchMatrix(int [][]mat, int target)
	{
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; i++)
			{
				if(mat[i][j]==target)
				{
					return true;
				}
			}
		}
		return false;
		
	}


	public static void main(String[] args) 
	{
		int[][] mat = 
			{
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
		
		 int target = 9;
		 
		 if(searchMatrix(mat, target))
		 {
			 System.out.println("Target Found ");
		 }
		 else
		 {
			 System.out.println("Target Not  Found ");
		 }
			 

		
	}
	}


