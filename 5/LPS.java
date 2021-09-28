// 5. Longest Palindromic Substring
public class LPS{
	public static String longestPalindrome(String s) {
		int n = s.length(),max=1,index=0;
        boolean [][]tab = new boolean[n][n];
        // length 1
        for (int i=0; i<n; i++) {
        	tab[i][i] = true;
        }
        // length 2
        for (int i=0;i<n-1 ;i++ ) {
        	if (s.charAt(i) == s.charAt(i+1)){
        		index = i;
        		max = 2;
        		tab[i][i+1] = true;
        	}
        }
        // length greater than 2
        for (int k = 3;k<=n;k++) { // length may be equal to n
        	for (int i=0; i<=(n-k);i++ ) { // start index
        		int j = i + k - 1; // end index
        		if (tab[i+1][j-1] == true && s.charAt(i)==s.charAt(j)){
        			tab[i][j] = true;
        			max = k;
        			index = i;
        		}
        	}
        }
        for (int i=index;i<(index + max) ;i++) {
        	S += s.charAt(i);
        }
        return S;
    }
	public static void main(String[] args) {
		String str = "babad";
		System.out.println(longestPalindrome(str));	
	}
}