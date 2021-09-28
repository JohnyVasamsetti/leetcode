// 509. Fibonacci Number
public class Fib{
	public int fib(int N) {
		int a=0,b=1,temp;
        if (N == 0 || N == 1)
        	return N;
        for (int i=2;i<=N;i++) {
        	temp = a;
        	a = b;
        	b = b + temp;
        }
        return b;
    }
    public static void main(String[] args) {
    	System.out.println(new Fib().fib(4));
    }
}