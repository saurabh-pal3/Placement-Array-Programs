package A3;

import java.util.Scanner;

public class Array 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Array Size :");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter the Element :");
		
		boolean issorted=true;
		for(int i=0; i<n ; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<n-1; i++)
		{

			if(arr[i]> arr[i+1])
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
