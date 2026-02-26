package A11;

public class Array
{
	public static void main(String[] args)
	{
		 int[] arr = {1, 1, 0, 1, 1, 1,1};
		 
		 int currentCount=0;
		 int maxCount=0;
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i]==1)
			 {
				 currentCount++;
				 if(currentCount>maxCount)
				 {
					 maxCount=currentCount;
				 }
				
			 }
			 else
			 {
				 currentCount=0;
			 }
		 }
		 
		 System.out.println("Max consecutive 1s = " + maxCount);
		
	}

}
