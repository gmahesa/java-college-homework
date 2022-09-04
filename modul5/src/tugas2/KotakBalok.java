package tugas2;

public class KotakBalok implements bangunRuang {
	double luas,keliling,volume;
	double p=2,l=1,t=3;
	@Override
	public double luas() {
		luas=2*((p*l)+(p*t)+(l*t));
		System.out.println("luas kotak balok = "+luas);
		return luas;
	}

	@Override
	public double volume() {
		volume=p*l*t;
		System.out.println("volume kotak balok = "+volume);
		return volume;
	}

	@Override
	public double keliling() {
		keliling=4*(p+l+t);
		System.out.println("keliling kotak balok = "+keliling);
		return keliling;
	}


}
