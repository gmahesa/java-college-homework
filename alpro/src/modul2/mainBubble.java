package modul2;

public class mainBubble {
	public static void main(String args[])
	{
		int arr[] = {8,6,9,57,2,4,3};
		
		BubbleSort BS = new BubbleSort();
		System.out.println("Bubble Sort");
		BS.bubbleSort(arr);
		
		/*
		int arr2[] = {2, 4, 0, 1, 4, 2, 6, 6, 8, 3, 6, 3, 9};
		
		SelectionSort SS = new SelectionSort();
		System.out.println("Selection Sort");
		SS.SelectionSort(arr2);
		
		int[] x = {9, 2, 4, 7, 3, 7, 10};
		int low = 0;
		int high = x.length - 1;
		
		QuickSort QS = new QuickSort();
		System.out.println("Quick Sort");
		QS.QuickSort(x,low,high);
		*/
	}
}
