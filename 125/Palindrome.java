public class Palindrome{
	public boolean isAlphaNumeric(char c){
		if ((c >= 'a' && c <= 'z') || (c >='0' && c <='9'))
			return true;
		return false;
	}
	public boolean isPalindrome(String s) {
		if (s == null)
			return false;
		s = s.toLowerCase();
		int front=0,rare = s.length()-1;
		while(front<rare){
			while(front < rare && !isAlphaNumeric(s.charAt(front))){
				front++;
			}
			while(front < rare &&  !isAlphaNumeric(s.charAt(rare))){
				rare--;
			}
			if(s.charAt(front) == s.charAt(rare)){
				front++;
				rare--;
				continue;
			}
			return false;
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(new Palindrome().isPalindrome("09"));
	}
}