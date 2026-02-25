package A9;

import java.util.LinkedHashSet;
import java.util.Set;

public class Collection
{
   public static void main(String[] args)
   {
	   int[] arr1 = {1, 2, 3, 4, 5};
	    int[] arr2 = {2, 3, 5, 6};

	    Set<Integer> list= new LinkedHashSet<Integer>();
	    
	    for(int x : arr1) list.add(x);
	    for(int x : arr2) list.add(x);
	    
	    
	    System.out.println(list);
	
}

}
