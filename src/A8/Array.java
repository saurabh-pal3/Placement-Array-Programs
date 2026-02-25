package A8;

import java.util.Scanner;

public class Array
{
	public static void main(String[] args)
	{

		int[] arr = {10, 20, 30, 40, 50};

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter element to search: ");
	    int num = sc.nextInt();
	    
	    int index=-1;
	    
	    for(int i=0; i<arr.length; i++)
	    {
	    	if(arr[i]==num)
	    	{
	    		index=i;
	    		break;
	    	}
	    }
//	    System.out.println()
	    System.out.println(index);
		
	}

}
