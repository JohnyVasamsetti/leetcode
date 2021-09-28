// 628. Maximum Product of Three Numbers

public class Pro_Three{
	public int maximumProduct(int[] nums) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int num : nums) {
			if(num >= max1){
				max3 = max2;
				max2 = max1;
				max1 = num;
			}
			else if(num >= max2){
				max3 = max2;
				max2 = num;
			}
			else if(num >= max3){
				max3 = num;
			}
			if (num <= min1){
				min2 = min1;
				min1 = num;
			}
			else if(num <= min2){
				min2 = num;
			}
		}
		int s1 = max1*max2*max3;
		int s2 = max1*min1*min2;
        return ( s1 > s2 ? s1:s2);
    }
	public static void main(String[] args) {
		System.out.println(new Pro_Three().maximumProduct(new int[]{-1,-2,-3,-4}));
	}
}