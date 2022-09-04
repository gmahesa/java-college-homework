package tugas1;

public class persegi extends shape {
	int p=4,l=2;
	int keliling,luas,volume;
	
	void getLuas() {
		luas=p*l;
		System.out.println("Luas persegi : "+luas);
	}
	
	void getVolume() {
		volume=0;
		System.out.println("volume persegi : "+volume);
	}
	
	void getKeliling () {
		keliling=2*(p+l);
		System.out.println("keliling persegi : "+keliling);
	}
	
}
