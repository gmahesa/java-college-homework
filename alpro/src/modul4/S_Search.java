package modul4;
import java.util.Scanner;
public class S_Search {

	public static void main(String[] args) {
		method m = new method();
		Scanner input = new Scanner(System.in);

		String key ; 
		String kalimat;
		
		System.out.print("Input Kalimat : "); 
		kalimat=input.nextLine();
		
		System.out.println("Input Huruf Yang Dicari : ");
		key = input.next();
		
		char[]kata=kalimat.toCharArray();
		char[]huruf=key.toCharArray();
		
		m.StringSearch(kata, huruf);
	}
}
