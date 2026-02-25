package A5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection 
{
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList(Arrays.asList(1,2,3,4,5)) ;
		
		Integer remove = list.remove(0);
		list.add(remove);
		list.forEach(System.out::println);
		 
		 
		
	}

}
