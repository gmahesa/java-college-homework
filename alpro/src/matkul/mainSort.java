package matkul;

public class mainSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6}; 

		InsertionSort IS = new InsertionSort();		 
		IS.sort(arr);
		
		SelectionSort SS = new SelectionSort();  
		SS.sort(arr);
		
		
	}

}
