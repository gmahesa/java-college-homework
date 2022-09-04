package nomor_1;

public class DatabaseSecurity extends pegawai {
	String Databasetool="database";
	public DatabaseSecurity(String nm, int old, double pay) {
		super(nm, old, pay);
		super.printData();{
			System.out.println("Databasetool : "+Databasetool+"\n");
		}
	}
}


