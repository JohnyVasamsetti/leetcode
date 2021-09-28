// 28. Implement strStr()
import java.util.*;
public class Str_Import{
	public int strStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }
		if (needle.length() > haystack.length()){
			return -1;
		}
        for (int i=0;i<haystack.length();i++) {
        	int j=i,k=0;
            if (i + needle.length() > haystack.length()) // important condition
                return -1;
        	while(j < haystack.length() && k < needle.length() && haystack.charAt(j) == needle.charAt(k)){
        		j++;
        		k++;
        	}
        	if (k== needle.length()){
        		return i;
        	}
        }
        return -1;
    }
    public static void main(String[] args) {
    	System.out.println(new Str_Import().strStr("",""));
    }
}