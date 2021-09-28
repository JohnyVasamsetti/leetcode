// 367. Valid Perfect Square

public class Perfect_Sqrt{
	public boolean isPerfectSquare(int num) {
        long mid , left = 0,right = num;
        while(left <= right){
        	mid = left + (right - left)/2;
        	if (mid * mid > num)
        		right = mid - 1;
        	else if(mid * mid < num)
        		left = left + 1;
        	else
        		return true;
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(new Perfect_Sqrt().isPerfectSquare(6));
	}
}