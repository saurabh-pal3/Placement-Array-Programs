package A1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class collection
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Array Size :");
		int n=sc.nextInt();
		
		 System.out.println("Enter the elements:");
		List<Integer> data= new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			data.add(sc.nextInt());
		}
		
		int max= Collections.max(data);
		System.out.println("Largest Element = " + max);
	}

}
