package modul4;
public class metotes {
	
	public int StringSearch(char[]arr, char[]key) {
		
		System.out.print("Huruf "+key[0]+" berada pada indeks ke "); 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key[0]||arr[i]+32==key[0]) {
				System.out.print(i +", ");
			}	
		}
		return 0;
	}
}