public class Shortest_Pal{
	public static String shortestPalindrome(String s) {
		int n = s.length(),max=1;
        boolean [][]tab = new boolean[n][n];
        // length 1
        for (int i=0; i<n; i++) {
        	tab[i][i] = true;
        }
        // length 2
        for (int i=0;i<n-1 ;i++ ) {
        	if (s.charAt(i) == s.charAt(i+1)){
        		if (i == 0 && max < 2){
        			max = 2;
        		}
        		tab[i][i+1] = true;
        	}
        }
        // length greater than 2
        for (int k = 3;k<=n;k++) { // length may be equal to n
        	for (int i=0; i<(n-k+1);i++ ) { // start index
        		int j = i + k - 1; // end index
        		if (tab[i+1][j-1] == true && s.charAt(i)==s.charAt(j)){
        			tab[i][j] = true;
        			if (i == 0 && max < k){
	        			max = k;
	        		}
        		}
        	}
        }
        System.out.println(max);
        String S=s;
        for (int i=max;i<n ;i++) {
        	S = s.charAt(i) + S;
        }
        return S;
    }
	public static void main(String[] args) {
		String str = "abb";
		System.out.println(shortestPalindrome(str));	
	}
}