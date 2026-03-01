package A18;

public class Transpose 
{
	public static void main(String[] args)
	{
		int[][] matrix= {
				{1,2,3},
				{4,5,6}
				
		};
		
		
		int row=matrix.length;
		int col=matrix[0].length;
		
		// for Storing persopse
		int transpose[][]= new int [col][row];
		
		// chmaging to transpose 
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}
		
		// for printing perpose
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print(transpose[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
