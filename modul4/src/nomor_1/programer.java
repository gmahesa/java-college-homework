package nomor_1;

public class programer extends pegawai{
	String Program="Java";
	public programer(String nm, int old, double pay) {
		super (nm,old,pay);
		super.printData();{
			System.out.println("bahasa Pemrograman : "+Program+"\n");
		}
	}
}
