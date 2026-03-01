package A19;

public class LowerTringulerMatrix 
{
	public static void main(String[] args)
	{

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n=matrix.length;
        
        // converting to lower traguler matrix
        
        for(int i=0; i<n; i++)
        {
        	for(int j=0; j<n; j++)
        	{
        		if(j > i)
        		{
        			matrix[i][j]=0;
        		}
        	}
        }
        
        // printing 2D Arrays
        for(int i=0; i<n; i++)
        {
        	for(int j=0; j<n; j++)
        	{
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
