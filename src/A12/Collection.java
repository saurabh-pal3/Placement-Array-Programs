package A12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Collection 
{
	public static void main(String[] args)
	{
		Set<Integer> list= new HashSet<Integer>(Arrays.asList(1,2,3,4,5,1,2,4,5));
		
		for(int x : list)
		{
			list.add(x);
		}
		
	     list.forEach(System.out::println);
		
	     
	     // Be he copy nko karu varacha te barabr nahi ahe je comment karun ahe te barabr ahe pn male samajala  nahi kahi
	     
//	     Map<Integer, Integer> freq = new HashMap<>();
//
//	     for (int x : arr) {
//	         freq.put(x, freq.getOrDefault(x, 0) + 1);
//	     }
//
//	     for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
//	         if (e.getValue() == 1) {
//	             System.out.println("Single element = " + e.getKey());
//	         }
//	     }
	}

}
