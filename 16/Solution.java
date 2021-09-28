import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);
    	int size = nums.length,diff = Integer.MAX_VALUE;
        for (int i=0;i<size && diff != 0;i++) {
        	int l=i+1;h=size-1;
        	while(l < h){
        		int s = nums[i] + nums[l] + nums[h];
        		if (Math.abs(target-s) < Math.abe(diff)){
        			diff = abs(target - s);
        		}
        		if (s < target)
        			l++;
        		if (s > target)
        			h--;
        	}
        }
        return target-diff;
    }
    public static void main(String[] args) {
    	
    }
}