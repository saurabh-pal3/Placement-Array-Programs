package A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection 
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Array Size :");
		int n=sc.nextInt();
		
		 System.out.println("Enter the elements:");
		List<Integer> data= new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)
		{
			data.add(sc.nextInt());
			
		}
		if(data.size()<2)
		{
			System.out.println(-1);
			return;
		}
		
		int max=Collections.max(data);
		
		data.removeIf(v->v==max);
		
		if(data.isEmpty())
		{
			System.out.println(-1);
		}
		else
		{
			int smax=Collections.max(data);
			System.out.println("Second Largest = " + smax);

		}
		
		
		
		
	}

}
