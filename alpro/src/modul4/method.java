package modul4;
public class method {
	
	public int StringSearch(char[]arr, char[]key) {
		
		int i, check = 2, tittle = 0, index = 0;	
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i]==key[0]||arr[i]+32==key[0]) {
				tittle+=1;
				check=1;
			}
			if (tittle==1) {
				System.out.print("Huruf "+key[0]+" berada pada indeks ke "); 
				tittle++; 
			}
			if (check==1) {
				System.out.print(i +", ");
				check=0;
			}
		}
		if (check!=1&&check!=0) {
			System.out.println("Huruf tidak ditemukan");
		}
		return 0;
	}
}