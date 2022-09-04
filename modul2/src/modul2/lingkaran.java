package modul2;

public class lingkaran{
	int diameter;
	double phi=3.14;
	
	public void setDiameter(int diameter) {
		this.diameter=diameter;}
	
	public int getDiameter() {
		return diameter;}
	
	public double getLuas() {
		double luas;
		luas = (double)(phi*(diameter*diameter)/4);
		return luas;}
}