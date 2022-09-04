package modul_satu;
import java.util.Scanner;
public class matriks_kali {

	public matriks_kali(){
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m ,n, mb, nb, total;
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.print("Jumlah baris matriks A : "); m = input.nextInt();
		System.out.print("Jumlah kolom matriks A : "); n = input.nextInt();
		System.out.println();
		System.out.print("Jumlah baris matriks B : "); mb = input.nextInt();
		System.out.print("Jumlah kolom matriks B : "); nb = input.nextInt();
		System.out.println();
		}while(n != mb);
		
		int mat_a [][] = new int [m][n];
		int mat_b [][] = new int [mb][nb];
		int mat_c [][] = new int [m][nb];
		
		//------------untuk inputan----------
		
		for (int i = 0 ; i < m ; i++) {
			System.out.println("Nilai baris ke " + (i+1) + " Matriks A : ");
			for (int j = 0 ; j < n ; j++) {
				mat_a [i][j] = input.nextInt();
			}
		}
		
		for (int i = 0 ; i < mb ; i++) {
			System.out.println("Nilai baris ke " + (i+1) + " Matriks B : ");
			for (int j = 0 ; j < nb ; j++) {
				mat_b [i][j] = input.nextInt();
			}
		}
		
		//-------------untuk hitung---------
		
		for (int i = 0; i < m ; i++){
			for (int j = 0; j < nb ; j++){
				total = 0;
				for (int k = 0; k < mb ; k++){
					total += mat_a[i][k] * mat_b[k][j];
				}	
				mat_c[i][j] = total;
			}
		}
		
		//-------------untuk output print------------ 
		
		System.out.println("Matriks A :");
		for (int i = 0 ; i < m ; i++) {
			for (int j = 0 ; j < n ; j++) {
				System.out.print("	" + mat_a [i][j] + "	");
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("Matriks B :");
		
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				System.out.print("	" + mat_b [i][j] + "	");
			}
			System.out.println();
		}
	
		System.out.println();
		System.out.println("Matriks C = Matriks A x Matriks B ");
		
		for (int i = 0; i < m ; i++){
			for (int j = 0; j < nb ; j++){
				System.out.print("	" + mat_c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
