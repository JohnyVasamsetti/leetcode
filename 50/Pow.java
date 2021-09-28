// 50. Pow(x, n)
public class Pow{
	public double myPow(double x, int n) {
		boolean negative = false;
		if (n < 0){
			negative = true;
		}
		double res = 1;
		while(n!=0){
			if (Math.abs(n)%2 == 1){
				res = res * x; // for odd ones
			}
			x = x * x;
			n /= 2;
		}
		if (negative==true)
			return 1/res;
		return res;
    }
	public static void main(String[] args) {
		System.out.println(new Pow().myPow(2,2));
	}
}