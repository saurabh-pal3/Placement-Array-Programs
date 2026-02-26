package A4;

import java.util.HashSet;

public class Collection 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,5,6,5,4,3,2};
		
		HashSet<Integer> orignal= new HashSet<Integer>();
		HashSet<Integer> duplicate= new HashSet<Integer>();
		
		for(int element: arr)
		{
			for(int i = 0; i < arr.length; i++)
			{
				duplicate.add(element);
			}
			
			
		}
		System.out.println("Duplicate Elements "+duplicate);
		
	}
	
	

}
