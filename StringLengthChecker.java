
public class StringLengthChecker {

	public int lastWordOfString(final String str) {
		int lengthCounted = 0;
		
		String strTrimmed = str.trim();
		
		for (int i = 0; i < strTrimmed.length(); i++) {
			if (strTrimmed.charAt(i) == ' ') {
				lengthCounted = 0;
			} else {
				lengthCounted++;
			}
		}
		
		return lengthCounted;
	}
	
	
	public static void main(String[] args) {
		String countLastWord = "something something apples ";
		StringLengthChecker sLC = new StringLengthChecker();
		
		System.out.println("Length Counted of last word is: " + sLC.lastWordOfString(countLastWord));
	}
}
