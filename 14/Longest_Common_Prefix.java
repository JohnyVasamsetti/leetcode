// 14. Longest Common Prefix
public class Longest_Common_Prefix{
	public String longestCommonPrefix(String[] strs){
        if(strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i=1;i<strs.length ; i++) {
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length() -1);
                if(prefix.length == 0)
                    return "";
            }
        }
        return prefix;
    }
	public static void main(String[] args) {
		String[] s = new String[]{};
		System.out.println(longestCommonPrefix(s));
	}
}