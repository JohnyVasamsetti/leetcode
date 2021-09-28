//880. Decoded String at Index.
public class Decode_Index{
	public static String decodeAtIndex(String S, int K) {
        String all = "";
        String temp = "";
        for (int i=0; i< S.length();i++) {
        	System.out.println("a : " +all);
        	System.out.println("t : " +temp);
        	char c = S.charAt(i);
        	if (c >= '0' && c <= '9'){
        		String num = "";
        		while(c >= '0' && c <= '9' ){
        			num += c;
        			if (i == S.length()-1)
        				break;
        			c = S.charAt(++i);
        		}
        		int count = Integer.parseInt(num);
        		System.out.println(num);
        		for (int j=0;j<count;j++) {
        			all += temp;
        		}
        		if (K < all.length())
    				return Character.toString(all.charAt(K-1));
        		temp = all;
        		all = "";
        	}
        	temp += c;
        	if (K <= temp.length())
    			return Character.toString(temp.charAt(K-1));
        }
        all = temp;
        return Character.toString(all.charAt(K-1));
    }
	public static void main(String[] args) {
		String str = "vzpp636m8y";
		System.out.println(decodeAtIndex(str,2920));
	}
}
