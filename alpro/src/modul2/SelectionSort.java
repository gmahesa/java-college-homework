package modul2;

public class SelectionSort {
    
	int tmp;        
	int selected;
    /*menukar nilai terkecil dengan elemen
     * yang telah dipilih dari unsorted array*/         
	void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {            
			selected = arr[i];            
			for (int j = i + 1; j < arr.length; j++) {                
				if (selected > arr[j]) {                    
					tmp = arr[j];                    
					arr[j] = selected;                    
					selected = tmp;                
				}            
			}            
			arr[i] = selected;        
		}
		for (int i = 0 ; i < arr.length ; i++)
		{	
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
