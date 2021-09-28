// 58. Length of Last Word
public class Last_Word{
	public static int lengthOfLastWord(String s) {
        if (s.length()==0){
            return 0;
        }
        int count=0,i=s.length()-1;
        System.out.println(i);
        while(s.charAt(i)!=' '){
        	i--;
        }
    	while(i>=0 && s.charAt(i)!=' '){
    		System.out.println(i);
    		count++;
    		i--;
    	}
    	return count;
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a "));
	}
}