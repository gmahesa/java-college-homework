package modul2;
import java.util.Scanner;
public class soal3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		lingkaran ling1 = new lingkaran();
		System.out.println("masukan diameter 1 = ");
		ling1.diameter=input.nextInt();
		
		lingkaran ling2 = new lingkaran();
		System.out.println("masukan diameter 2 = ");
		ling2.diameter=input.nextInt();
		
		System.out.println("luas lingkaran 1 = "+ling1.getLuas());
		System.out.println("luas lingkaran 2 = "+ling2.getLuas());
	}
}
