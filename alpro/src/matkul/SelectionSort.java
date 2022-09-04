package matkul;
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length;  
		for (int i = 0; i < n-1; i++) 
		{ 
			//menentukan index terkecil terlebih dahulu 
			int min = i; 
			for (int j = i+1; j < n; j++) 
			{ 
				if (arr[j] < arr[min]) 
					min = j; 
			}
			//tukarkan nilai
			int temp = arr[min]; 
			arr[min] = arr[i]; 
			arr[i] = temp; 
		}
		System.out.println("SELECTION SORT :");
		for (int i=0; i<n; ++i) 
		{
			System.out.print(arr[i]+" ");  
		}
		System.out.println(); 
	} 
}