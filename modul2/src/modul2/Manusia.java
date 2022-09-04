package modul2;
public class Manusia{
	private String nama;
	protected String jenisKelamin;
	public String alamat;
	
	public String Norang(String N) {
		nama = N;
		return N;
	}
	public String JKorang(String JK) {
		jenisKelamin = JK;
		return JK;
	}
	public String Aorang(String A) {
		alamat = A;
		return A;
	}
}
