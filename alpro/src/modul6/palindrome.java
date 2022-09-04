package modul6;
import java.io.*; 
public class palindrome {
	public void isPalindrome (String text) {
		
		text = text.toLowerCase();
		
		String kata = "";
		
		for (int i = text.length()-1 ; i>=0 ; i-- )
			kata += text.charAt(i);
		
		if(text.equals(kata)==true)
			System.out.println("kata \""+text+"\" adalah palindrome");
		
		else
			System.out.println("kata \""+text+"\" tidak palindrome");	
		
	}
}
