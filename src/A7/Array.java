package A7;

import java.util.Arrays;

public class Array 
{
	public static void main(String[] args)
	{
		  int[] arr = {0, 1, 0, 3, 12};
		  
		  int retult[]= new int[arr.length];
		  
		  int index=0;
		  
		  for(int i=0; i<arr.length; i++)
		  {
			  if(arr[i] !=0)
			  {
				  retult[index]=arr[i];
				  index++;
				  
			  }
		  }
		  System.out.println(Arrays.toString(retult));
		
	}

}
