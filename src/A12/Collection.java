package A12;

import java.util.HashMap;

public class Collection 
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,1,2,4,5};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int e : arr)
		{
			map.put(e, map.getOrDefault(map, 0)+1);
			
			
		}
		
		for(int key : map.keySet())
		{
			if(map.get(key)==1)
			{
				System.out.println(key);
			}
		}
	}

}
