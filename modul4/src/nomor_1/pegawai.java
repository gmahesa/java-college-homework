package nomor_1;
public class pegawai {
	String nama;
	int umur;
	double gaji;
	public pegawai(String nm, int old, double pay) {
		this.nama=nm;
		this.umur=old;
		this.gaji=pay;		
	}
	public void printData() {
		System.out.println("Nama\t: "+nama);
		System.out.println("umur\t: "+umur);
		System.out.println("gaji\t: "+gaji);
	}
}