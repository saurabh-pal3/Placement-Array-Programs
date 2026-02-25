package four.remove.duplicate;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,5,6,5,4,3,2};
		
		IntStream distinct = Arrays.stream(arr).distinct();
		distinct.forEach(System.out::println);
		
	}

}
