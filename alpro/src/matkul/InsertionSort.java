package matkul;
class InsertionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=1; i<n; ++i) 
		{ 
			//menentukan element untuk dibandingkan (key)
			int key = arr[i]; 
			int j = i-1; 

			//memindah arr[0] ke arr[1] 
			//jika arr[0] lebih besar dari key(arr[1])
			while (j>=0 && arr[j] > key) 
			{ 
				//menukar nilai arr[1] dengan nilai arr[0] 
				arr[j+1] = arr[j]; 
				j = j-1; //arr[-1] untuk keluar dari while
			} 
			//menukar niali arr[0] 
			//dengan nilai key(arr[1] sebelum diganti)
			arr[j+1] = key; 
		}
		System.out.println("INSERTION SORT :");
		for (int i=0; i<n; ++i) 
		{
			System.out.print(arr[i] + " "); 
		}
		System.out.println();
	} 
} 
