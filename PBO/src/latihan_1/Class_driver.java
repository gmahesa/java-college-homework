/*
 * Nama 	:	Galang Aji Mahesa
 * NIM		:	201710370311199
 * Kelas	:	2E
 */
package latihan_1;

public class Class_driver {

	public static void main(String[] args) {
		double jariA=4.5, jariB=3, jariC=6.3;
		
		LINGKARAN lingA = new LINGKARAN();
		System.out.println("==== LINGKARAN A ====");
		System.out.println("luas = "+lingA.Luas(jariA)+" cm2");
		System.out.println("keliling = "+lingA.keliling(jariA)+" cm");

		LINGKARAN lingB = new LINGKARAN();
		System.out.println("\n==== LINGKARAN B ====");
		System.out.println("luas = "+lingB.Luas(jariB)+" cm2");
		System.out.println("keliling = "+lingB.keliling(jariB)+" cm");

		LINGKARAN lingC = new LINGKARAN();
		System.out.println("\n==== LINGKARAN C ====");
		System.out.println("luas = "+lingC.Luas(jariC)+" cm2");
		System.out.println("keliling = "+lingC.keliling(jariC)+" cm");
	}
}
