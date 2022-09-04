package modul6;
import java.util.*;
public class driverpoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kata;
		Scanner input = new Scanner(System.in);
		kata = input.nextLine();
		palindrome tes = new palindrome();
		//test tes = new  test();
		tes.isPalindrome(kata);
	}

}
