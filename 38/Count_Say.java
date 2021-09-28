// 38. Count and Say
import java.util.*;
public class Count_Say{
	public static String countAndSay(int n) {
        if (n <= 0)
        	return "";
        if ( n == 1)
        	return "1";
        else{
        	String s = countAndSay(n-1); // Calling recursively
        	StringBuilder sb = new StringBuilder("");
        	int i = 0;
        	while(i < s.length()){
        		int count = 1;
        		while((i + 1) < s.length() && s.charAt(i) == s.charAt(i+1) ){
        			count++; // incrementing the count of a digit
        			i++; // incrementing the index
        		}
        		sb.append(count + "" + s.charAt(i)); // after coming from while loop , the count and digit at index i is added to string_buffer
        		i++;
        	}
		    return sb.toString();
        }
    }
    public static void main(String[] args) {
    	// System.out.println(countAndSay(1));
    	// System.out.println(countAndSay(2));
    	// System.out.println(countAndSay(3));
    	// System.out.println(countAndSay(4));
    	System.out.println(countAndSay(5));
    	// System.out.println(countAndSay(6));
    	// System.out.println(countAndSay(7));
    }
}