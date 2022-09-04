package modul_satu;
import java.util.Scanner;
public class matriks_kurang {

	public matriks_kurang() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baris , kolom;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jumlah baris matriks : "); baris = input.nextInt();
		System.out.print("Jumlah kolom matriks : "); kolom = input.nextInt();
		
		int mat_a [][] = new int [baris][kolom];
		int mat_b [][] = new int [baris][kolom];
		int mat_c [][] = new int [baris][kolom];
		
		//------------untuk inputan---------------
		
		for (int i = 0 ; i < baris ; i++) {
			System.out.println("Nilai baris ke " + (i+1) + " Matriks A : ");
			for (int j = 0 ; j < kolom ; j++) {
				mat_a [i][j] = input.nextInt();
			}
		}
		
		for (int i = 0 ; i < baris ; i++) {
			System.out.println("Nilai baris ke " + (i+1) + " Matriks B : ");
			for (int j = 0 ; j < kolom ; j++) {
				mat_b [i][j] = input.nextInt();
			}
		}
		
		//--------------untuk hitung------------------
		
		for (int i = 0 ; i < baris ; i++) {
			for (int j = 0 ; j < kolom ; j++) {
				mat_c [i][j] = mat_a [i][j] - mat_b [i][j] ;
			}
		}
		
		//--------------untuk print---------------
		
		System.out.println("Matriks A :");
		for (int i = 0 ; i < baris ; i++) {
			for (int j = 0 ; j < kolom ; j++) {
				System.out.print("	" + mat_a [i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("Matriks B :");
		
		for (int i = 0 ; i < baris ; i++) {
			for (int j = 0 ; j < kolom ; j++) {
				System.out.print("	" + mat_b [i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriks A - B = Matriks C");
		
		for (int i = 0 ; i < baris ; i++) {
			for (int j = 0 ; j < kolom ; j++) {
				System.out.print("	" + mat_c [i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
