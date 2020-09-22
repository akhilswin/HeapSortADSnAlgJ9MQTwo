package yaksha;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements to be sorted:");
		n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " integer elements");
		for (int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		Array array = new Array(arr);
		int result[] = HeapSort.heapSort(array);
		System.out.println("After sorting ");
		for (int i = 0; i < n; i++)
			System.out.println(result[i] + " ");
		System.out.println();
		in.close();
	}
}
