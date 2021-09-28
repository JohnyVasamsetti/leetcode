// 69. Sqrt(x)
import java.util.*;
public class Sqrt{
	public int mySqrt(int x) {
		double mid,left=0,right=x;
		while(left <= right){
			mid = left +  (right - left) /2;
			if (mid * mid > x)
				right = (int)(mid - 1.0);
			else if(mid * mid < x)
				left = (int)(mid + 1.0);
			else
				return (int)mid;
		}
		return (int)right;
    }
	public static void main(String[] args) {
		System.out.println(new Sqrt().mySqrt(2147395599));
	}
}