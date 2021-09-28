// 53. Maximum Subarray
import java.util.*;
public class Max_Sub{
	public int maxSubArray(int[] nums) {
        int temp = nums[0],high = nums[0];
        for (int i=1;i<nums.length;i++) {
        	temp = Math.max(temp + nums[i],nums[i]);
        	if (high < temp){
        		high = temp; // if temp > 0 aned  the nums[i] is negative and abs(nums[i]) > temp then temp+nums[i] will the next temp.
        	}
        }
        return high;
    }
	public static void main(String[] args) {
		System.out.println(new Max_Sub().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}
}