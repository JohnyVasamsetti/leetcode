// 989. Add to Array-Form of Integer
import java.util.*;
public class Array_Form{
	public static List<Integer> addToArrayForm(int[] A, int K) {
		List<Integer> l = new ArrayList<Integer>();
		int n = A.length - 1,r = 0,t=0;
        while(n >= 0 && K > 0){
        	int ans = A[n--] + (K % 10) + r;
        	l.add(0,ans % 10);
        	r = ans / 10;
        	K = K / 10;
        }
    	while(n >= 0){
    		int ans = A[n--] + r;
        	l.add(0,ans % 10);
        	r = ans / 10;
    	}
        while(K > 0){
        	int ans = (K % 10) + r;
        	l.add(0,ans % 10);
        	r = ans / 10;
        	K = K / 10;
        }
        if ( r > 0)
        	l.add(0,r);
        System.out.println(l);
        return l;
    }
	public static void main(String[] args) {
		System.out.println(addToArrayForm(new int[]{9,9,9,9},1));
	}
}