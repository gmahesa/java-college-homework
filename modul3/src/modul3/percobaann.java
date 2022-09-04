package modul3;
import java.util.Scanner;
public class percobaann {

	
	public static void main(String[] args) {
		
		int pilih;
		int [] total = new int [3];
		barang item = new barang();
		Scanner input = new Scanner (System.in);
		
		for(int i =0;;i++) {
			System.out.println("SELAMAT DATANG DI TOKO KAMI, BERIKUT INI ADALAH DAFTAR BARANG YANG BISA ANDA BELI :");
			System.out.println("1. SABUN Rp. 2500\n2. PERMEN Rp. 4000\n3. SUSU Rp.8000");
			System.out.println("MASUKAN NOMOR BARANG YANG AKAN ANDA BELI (ATAU TEKAN 0 UNTUK SELESAI) : "); pilih=input.nextInt();

			if (pilih==1)
			{
				System.out.println("BERAPA JUMLAH YANG INGIN ANDA BELI? "); item.jumlah_barang[0]=input.nextInt();
				item.harga_barang=2500;
				item.total_harga+=(item.harga_barang*item.jumlah_barang[0]);
				total[0]=item.harga_barang*item.jumlah_barang[0];
				System.out.println(item.nama_barang[0]+"\t|\tQTY : "+item.jumlah_barang[0]+" \t|\tHARGA : "+total[0]);
				System.out.println("=============================================================================================");
			}
			
			if (pilih==2)
			{
				System.out.println("BERAPA JUMLAH YANG INGIN ANDA BELI? "); item.jumlah_barang[1]=input.nextInt(); 
				item.harga_barang=4000;
				item.total_harga+=(item.harga_barang*item.jumlah_barang[1]);
				total[1]=item.harga_barang*item.jumlah_barang[1];
				System.out.println(item.nama_barang[1]+"\t|\tQTY : "+item.jumlah_barang[1]+" \t|\tHARGA : "+total[1]);
				System.out.println("=============================================================================================");
			}
			
			if (pilih==3)
			{
				System.out.println("BERAPA JUMLAH YANG INGIN ANDA BELI? "); item.jumlah_barang[2]=input.nextInt(); 
				item.harga_barang=8000;
				item.total_harga+=(item.harga_barang*item.jumlah_barang[2]);
				total[2]=item.harga_barang*item.jumlah_barang[2];
				System.out.println(item.nama_barang[2]+"\t|\tQTY : "+item.jumlah_barang[2]+" \t|\tHARGA : "+total[2]);
				System.out.println("=============================================================================================");
			}
			
			if (pilih==0)
			{
				System.out.println("DAFTAR BELANJAAN ANDA : ");
				for(int j=0;j<3;j++) {
					System.out.println(item.nama_barang[j]+"\t|\tQTY : "+item.jumlah_barang[j]+" \t|\tHARGA : "+total[j]);
				}
				System.out.println("============ TOTAL : "+item.total_harga+" ============");
				break;
			}
		}
	}

}
