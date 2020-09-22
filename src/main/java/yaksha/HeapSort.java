package yaksha;

public class HeapSort {
	private static int N;

	public static int[] heapSort(Array array) {
		int arr[] = array.getArr();
		heapMethod(arr);
		for (int i = N; i > 0; i--) {
			swap(arr, 0, i);
			N = N - 1;
			heap(arr, 0);
		}
		return arr;
	}

	public static void heapMethod(int arr[]) {
		N = arr.length - 1;
		for (int i = N / 2; i >= 0; i--)
			heap(arr, i);
	}

	public static void heap(int arr[], int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;
		if (left <= N && arr[left] > arr[i])
			max = left;
		if (right <= N && arr[right] > arr[max])
			max = right;
		if (max != i) {
			swap(arr, i, max);
			heap(arr, max);
		}
	}

	public static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
