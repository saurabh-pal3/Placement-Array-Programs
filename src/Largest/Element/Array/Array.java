package Largest.Element.Array;

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
		for(int i=0 ;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max1=arr[0];
		
		for(int i=1; i<n; i++)
		{
			if(arr[i]>max1)
			{
				max1=arr[i];
			}
		}
		
		System.out.println("Largest (Loop) = " + max1);
		
	}

}
