package secound.SecoundLargest;

import java.util.Scanner;

public class Array
{
	public static void main(String[] args)
	{
		int max= Integer.MIN_VALUE;
		int secoundmax=Integer.MIN_VALUE;
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Array Size :");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter the Element :");
		
				
		for(int s=0; s<n;s++)
		{
			arr[s]=sc.nextInt();
			if(arr[s]>max)
			{
			   secoundmax=max;
				max=arr[s];
			}
			else if(arr[s] >secoundmax && arr[s]!=max)
			{
				secoundmax=arr[s];
			}
		}
		System.out.println("The Secound Gretest Number :"+secoundmax);
		
		
	}

}
