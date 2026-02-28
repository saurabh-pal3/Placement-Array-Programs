package A13;

public class Array
{
  public static void main(String[] args) 
  {
	  int[] arr = {1, 2, 3, 1, 1, 1, 1};
	  int k=3;
	  int max=0;
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  int sum=0;
		  for(int j=i; j<arr.length; j++)
		  {
			  sum+=arr[j];
			  
			  if(sum==k)
			  {
				  int len=j-i+1;
				  if(len >max)
				  {
					  max=len;
				  }
			  }
		  }
	  }
	  System.out.println(max);
	
}

}
