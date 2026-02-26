package A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Stream
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Size :");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            data.add(sc.nextInt());
        }

        if (data.size() < 2)
        {
            System.out.println(-1);
            return;
        }

        int result=data.stream()
        		.distinct()
        		.sorted(Collections.reverseOrder())
        		.skip(1)
        		.findFirst()
        		.orElse(-1);
		
        System.out.println("Second Largest = " + result);
	}

}
