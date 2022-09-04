package modul2;
class BubbleSort
{
	void bubbleSort(int arr[])
	{
		//proses
		for (int i = 0 ; i < arr.length-1 ; i++)
		{
			//langkah tiap proses
			for (int j = 0 ; j < arr.length-i-1 ; j++)
			{
				//membandingkan
				if (arr[j] > arr[j+1])
				{
					//tukar nilai
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//print
		for (int i = 0 ; i < arr.length ; i++)
		{	
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
