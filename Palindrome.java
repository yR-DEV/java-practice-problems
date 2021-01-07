
public class Palindrome {
	
	static boolean palindromeChecker(String word) {
		int i = 0;
		int j = word.length() - 1;
		
		while (i < j) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		// returns true if the conditional is not met
		return true;
	}
	
	public static void main(String[] args) {
		String palindrome = "racecar";
		String notPalindrome = "something";
		
		if (palindromeChecker(palindrome)) {
			System.out.println("YES!");
		} else {
			System.out.println("no.");
		}
		
		if (palindromeChecker(notPalindrome)) {
			System.out.println("YES!");
		} else {
			System.out.println("no.");
		}
	}
	
}
