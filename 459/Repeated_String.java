// 459. Repeated Substring Pattern
import java.util.*;
public class Repeated_String{
	// public static boolean repeatedSubstringPattern(String s) {
 //        int i=0,n = s.length() ;
 //        boolean flag = true;
 //        for (i=1;i<=(int)n/2;i++) {
 //        	if (n%i != 0)
 //        		continue;
 //        	flag = true;
 //        	System.out.println((int)n/i);
 //        	for (int j = 1;j<(int)n/i;j++) {
 //        		for (int k=0;k<i;k++) {
 //        			System.out.println(s.charAt(k) + " " + s.charAt(i*j + k));
 //        			if(!(s.charAt(k) == s.charAt((i*j + k)))) {
 //        				flag = false;
 //        				break;
 //        			}
 //        		}
 //        		if (!flag)
 //        			break;
 //        	}
 //        	if (flag == true)
 //        		return true;
 //        }
 //        return false;
 //    }

	public static boolean repeatedSubstringPattern(String s) {
		String repeate = "";
		int n = s.length();
        for (int i=0;i<n/2;i++ ) {
        	repeate += s.charAt(i);
        	if (n % repeate.length() == 0){
        		if (repeate.repeat(n / repeate.length()).equals(s)){
        			return true;
        		}
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abcabc"));
	}
}



