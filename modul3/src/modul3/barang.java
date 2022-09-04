package modul3;

public class barang {

	public int [] jumlah_barang=new int[3];
	public int harga_barang;
	public int total_harga=0 ;
	public String [] nama_barang = new String[3];
	
	public barang() {
		harga_barang=0;
		nama_barang[0]= "SABUN Rp. 2500";
		nama_barang[1]= "PERMEN Rp. 4000";
		nama_barang[2]= "SUSU Rp. 8000";	
	}
}
