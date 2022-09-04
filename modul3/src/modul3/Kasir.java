package modul3;
import java.util.Scanner;
public class Kasir {
	public static void main(String[] args) {
		
		int pilih;
		int [] total = new int [3];
		barang2 item= new barang2();
		Scanner input = new Scanner (System.in);
		
		for(int i =0;;i++) {
			System.out.println("SELAMAT DATANG DI TOKO KAMI, BERIKUT INI ADALAH DAFTAR BARANG YANG BISA ANDA BELI :");
			System.out.println("1. SABUN Rp. 2500\n2. PERMEN Rp. 4000\n3. SUSU Rp.8000");
			System.out.println("MASUKAN NOMOR BARANG YANG AKAN ANDA BELI (ATAU TEKAN 0 UNTUK SELESAI) : "); pilih=input.nextInt();
			
			for(int k=1;k<4;k++)
			{
				if (pilih==k)
				{
					System.out.println("BERAPA JUMLAH YANG INGIN ANDA BELI? "); item.jumlah_barang[k-1]=input.nextInt();
					item.total_harga+=(item.harga_barang[k-1]*item.jumlah_barang[k-1]);
					total[k-1]=item.harga_barang[k-1]*item.jumlah_barang[k-1];
					System.out.println(item.nama_barang[k-1]+"\t|\tQTY : "+item.jumlah_barang[k-1]+" \t|\tHARGA : "+total[k-1]);
					System.out.println("=============================================================================================");
				}
			}
			if (pilih==0)
			{
				System.out.println("DAFTAR BELANJAAN ANDA : ");
				for(int j=0;j<3;j++) {
					System.out.println(item.nama_barang[j]+"\t|\tQTY : "+item.jumlah_barang[j]+" \t|\tHARGA : "+total[j]);
				}
				System.out.println("============ TOTAL : "+item.total_harga+" ============");
				System.out.println("TERIMAKASIH.");
				break;
			}
		}
	}
}
