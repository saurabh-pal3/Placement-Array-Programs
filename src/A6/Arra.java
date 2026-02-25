package A6;

import java.util.Arrays;

public class Arra 
{
	
	    public static void main(String[] args) 
	    {
	       int arr[]={1,2,3,4,5};
	       
	     
	       int D=2;
	       D=D%arr.length;
	       
	       
	       for(int d=0; d<D; d++)
	       {
	    	   int f=arr[0];
	           for(int i=0 ; i<arr.length-1; i++)
	           {
	               arr[i]=arr[i+1];
	           }
	            arr[arr.length-1]=f;
	       }
	      
	       System.out.println(Arrays.toString(arr));
	    }
	}



