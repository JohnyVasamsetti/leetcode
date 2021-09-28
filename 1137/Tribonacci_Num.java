// 1137. N-th Tribonacci Number
import java.util.*;
public class Tribonacci_Num{
	public int tribonacci(int n) {
        int[] trib = new int[3];
        trib[0] = 0;
        trib[1] = 1;
        trib[2] = 1;
        if (n >= 0 && n <= 2)
        	return trib[n];
        for (int i=3;i<=n;i++) {
        	trib[i%3] = trib[0] + trib[1] + trib[2];
        }
        return trib[n%3];
    }
	public static void main(String[] args) {
		System.out.println(new Tribonacci_Num().tribonacci(4));
	}
}