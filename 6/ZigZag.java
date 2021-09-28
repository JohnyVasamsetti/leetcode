import java.util.*;
public class ZigZag{
	public static String convert(String s, int numRows) {
		int n = s.length();
        String[] strs = new String[numRows];
        for (int k=0;k<numRows;k++) {
        	strs[k] = "";
        }
        boolean down = false;
        int i = 0;
        for (int j=0;j<n;j++) {
        	if (n == 0 || numRows <= 1)
        		return s;
        	else{
        		strs[i]+= s.charAt(j);
        		if (i == 0 || i == numRows -1 ){
        			down = !(down);
        		}
        		if (down==true) i+=1;
        		else i-=1;
        	}
        }
        String ss = "";
        for(String str : strs)
        	ss += str;
        return ss;
    }
	public static void main(String[] args) {
		System.out.println( convert("PAYPALISHIRING",3));
	}
}