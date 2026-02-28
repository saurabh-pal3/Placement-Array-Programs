package A15;

public class TwoDArrays
{
	public static void main(String[] args) 
	{
		// Declear the matrix 2DArray
		int[][] matrix= {
				{1,1,1},
				{1,0,1},
				{1,1,1},
		};
		
		//find they Length of arrys
		
		int rows=matrix.length;
		int cols=matrix[0].length; // start form {o,o} index
		
		//Create marker arrays for tractiking with row and colume is zero
		
		boolean []row = new boolean[rows];
		boolean []col = new boolean[cols];
		
		//itering the loop for cking with is zero
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(matrix[i][j]==0)
				{
					row[i]=true;
					col[j]=true;
				}
			}
		}
		
		// if zero is found make row and colume as zero
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(row[i] || col[j])
				{
					matrix[i][j]=0;
				}
			}
		}
		
		// printing the final output 
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
