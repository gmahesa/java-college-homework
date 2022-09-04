package modul1;
import java.util.Scanner;
public class soal3 {
	public static void main(String[] args) {
		 Double volume;
	     int p, l, t;
	     Scanner baca = new Scanner(System.in);
	     System.out.println("== Program hitung volume limas segi empat");
	     System.out.print("Input panjang: ");
	     p = baca.nextInt();
	     System.out.print("Input lebar: ");
	     l = baca.nextInt();
	     System.out.print("Input tinggi: ");
	     t = baca.nextInt();
	     volume = Double.valueOf((p * l * t)/3) ;
	     System.out.println("volume = " + volume);	
	}
}
