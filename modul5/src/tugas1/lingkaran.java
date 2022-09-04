package tugas1;

public class lingkaran extends shape {
	double phi = 3.14;
	double r = 9;
	double luas, keliling, volume;
	void getLuas() {
		luas=phi*r*r;
		System.out.println("Luas Lingkaran : "+luas);
	}

	void getVolume() {
		volume = 0 ;
		System.out.println("Volume Lingkaran : "+volume);
	}
	
	void getKeliling() {
		keliling = phi*(2*r) ;
		System.out.println("keliling Lingkaran : "+keliling);
	}

	

}
