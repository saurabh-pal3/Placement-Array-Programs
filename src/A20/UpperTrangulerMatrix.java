package A20;

public class UpperTrangulerMatrix 
{
	public static void main(String[] args) 
	{

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        // coverting the upper Tranguler matrix 
        
        int n=matrix.length;
        
        for(int i=0; i<n; i++)
        {
        	for(int j=0; j<n; j++)
        	{
        		if(i>j)
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
