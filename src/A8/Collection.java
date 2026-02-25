package A8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Collection 
{
	public static void main(String[] args)
	{
		List<Integer > list=Arrays.asList(10,20,30,40,50);
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter element to search: ");
	        int num = sc.nextInt();

//	        int index = -1;   // default if not found
	        
	        int indexOf = list.indexOf(num);
	        
	        System.out.println(indexOf);
	        
	        
		
		
	}

}
