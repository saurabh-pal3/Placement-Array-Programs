package A3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection
{
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The Array Size :");
			int n=sc.nextInt();
			

             List<Integer> l= new ArrayList<Integer>();
			System.out.println("Enter the Element :");
			
			boolean issorted=true;
			for(int i=0; i<n ; i++)
			{
				l.add(sc.nextInt());
				
			}
			
			for(int i=0; i<n-1; i++)
			{
				if(l.get(i)> l.get(i+1))
				{
					issorted=false;
					break;
				}
			}
			if (issorted)
	        {
	            System.out.println("true");
	        } else 
	        {
	            System.out.println("false");
	        }
	}

}
