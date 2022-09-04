package pbo2;

public class saldo {
	int saldo,simpan,ambil;
	public saldo() {
		saldo=100000;
	}
	public int Simpan () {
		saldo=saldo+simpan;
		return saldo;
	}
	public int Ambil () {
		saldo=saldo-ambil;
		return saldo;
	}
	public int getSaldo () {
		return saldo;
	}
	

}
