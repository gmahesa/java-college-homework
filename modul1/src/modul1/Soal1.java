package modul1;
import java.util.Scanner;
public class Soal1 {
	public static void main(String[] args) {
		 Double volume;
	     int p, l, t;
	     Scanner baca = new Scanner(System.in);
	     System.out.println("== Program hitung volume");
	     System.out.print("Input panjang: ");
	     p = baca.nextInt();
	     System.out.print("Input lebar: ");
	     l = baca.nextInt();
	     System.out.print("Input tinggi: ");
	     t = baca.nextInt();
	     if (p<=0||l<=0||t<=0)
	     {System.out.println("Peringatan! \nanda menginputkan nilai <=0");}
	     volume = Double.valueOf(p * l * t) ;
	     System.out.println("volume = " + volume);
	}

}
