package tugas2;

public class persegiKubus implements bangunRuang {
	double luas,keliling,volume;
	double s=3;
	
	@Override
	public double luas() {
		// TODO Auto-generated method stub
		luas=6*(s*s);
		System.out.println("luas kubus = "+luas);
		return luas;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		volume=s*s*s;
		System.out.println("volume kubus = "+volume);
		return volume;
	}
	@Override
	public double keliling() {
		// TODO Auto-generated method stub
		keliling=12*s;
		System.out.println("keliling kubus = "+keliling);
		return keliling;
	}

}
