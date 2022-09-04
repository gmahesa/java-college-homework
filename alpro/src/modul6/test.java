package modul6;
public class test {
	public Boolean isPalindrome(String kata) {
		String check = kata.toLowerCase();
		int length = check.length();
		int forward = 0;
		int backward = length - 1;
		Boolean palindrome = true;
		while (backward > forward) {
			char forwardChar = check.charAt(forward++);
			char backwardChar = check.charAt(backward--);
			System.out.println(forwardChar != backwardChar);
			if (forwardChar != backwardChar)
				palindrome = false;
				System.out.println("maaf kata \""+kata+"\" tidak palindrome bosque");			
				return palindrome;
				
		}
		if (palindrome == true)
			System.out.println("kata \""+kata+"\" ini palindrome bosque");	
		return true;
	}
}