package Largest.Element.Array;



import java.util.Arrays;
import java.util.Scanner;

public class Steam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Array Size :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // take actual array elements
        }

        // Streams approach on array
        int max3 = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest (Streams) = " + max3);
    }
}