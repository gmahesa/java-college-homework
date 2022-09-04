package pbo2;
import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilih,i;
		Scanner input = new Scanner (System.in);
		saldo Bank = new saldo ();
		System.out.println("Selamat Datang Di Bank UMM...!");
		System.out.println("Saldo anda saat ini "+Bank.getSaldo());
		System.out.println("1. Simpan Uang. \n2. Ambil Uang. \n3. keluar \n: "); pilih=input.nextInt();
		if(pilih==1) {
			System.out.println("Masukkan nominal: "); Bank.simpan=input.nextInt();
			System.out.println("Saldo Anda saat ini "+Bank.Simpan()); 
		}
		if(pilih==2) {
			System.out.println("Masukkan nominal: "); Bank.ambil=input.nextInt();
			System.out.println("Saldo Anda saat ini "+Bank.Ambil()); 
		}
		if(pilih==3) {
			System.out.println("Terimakasih!\nSilahkan Ambil Kartu ATM Anda!");			 
		}
		if(pilih>3||pilih<1) {
			System.out.println("Input Salah!\nSilahkan Ulangi.");
		}
	}


}
