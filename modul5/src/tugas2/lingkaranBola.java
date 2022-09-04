package tugas2;

public class lingkaranBola implements bangunRuang, bola  {
	double luas,keliling,volume,volumeb,phi=3.14,r=4;
	

	public double luas() {
		luas=4*phi*r*r;
		System.out.println("luas lingkaran = "+luas);
		return luas;
	}

	public double volume() {
		volume=4/3*phi*r*r*r;	
		System.out.println("volume kubus = "+volume);
		return volume;
	}

	public double keliling() {
	
		return 0;
	}

	public double volume(double jari) {
		volumeb=4*phi*jari*jari;
		System.out.println("volume kubus = "+volumeb);
		return volumeb;
	}

}
