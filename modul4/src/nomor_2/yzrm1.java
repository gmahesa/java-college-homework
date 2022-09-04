package nomor_2;

	public class yzrm1 extends motor{
	String series="YZR-M1";
	int kecepatan=320;
	public yzrm1(String tipe) {
		super (tipe);
		{
			System.out.println("Yamaha model : "+series);
			System.out.println("max : "+kecepatan+"kmph\n");
		}
	}
}



/*
public class yzrm1 extends motor{
	String series = "Yamaha Model : YZR-M1";
	public yzrm1(String tipekendaraan) {
		super(tipekendaraan);
	}
	void series() {
		System.out.println(series);
	}
	public void brand(String brand) {
		System.out.println(brand);
	}
	public void tipeKendaraan(String tipekendaraan) {
		System.out.println(tipekendaraan);	
	}
	public void Kecepatan(int kecepatan) {
		System.out.println("max : "+kecepatan+"kmph");
	}
}
*/