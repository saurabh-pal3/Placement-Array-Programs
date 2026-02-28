package A16;

public class Rotating90degree 
{
	public static void main(String[] args) 
	{
		// Declear the matrix 2DArray
					int[][] matrix= {
							{1,2,3},
							{4,5,6},
							{7,8,9},
					};
					
					int n=matrix.length;
					
					// Step 1: Transpose
					
					for(int i=0; i<n; i++)
					{
						for(int j=i; j<n; j++)
						{
							int temp=matrix[i][j];
							matrix[i][j]=matrix[j][i];
							 
							matrix[j][i]=temp;
							
						}
					}
					
					//  Step 2: Reverse each row
					
					for(int i=0; i<n; i++)
					{
						int left=0;
						int rigth=n-1;
						
						while(left<rigth)
						{
							int temp=matrix[i][left];
							matrix[i][left]=matrix[i][rigth];
							matrix[i][rigth]=temp;
							
							left++;
							rigth--;
						}
					}
					
					// printing the final output 
					
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
