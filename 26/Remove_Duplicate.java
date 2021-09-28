// 26. Remove Duplicates from Sorted Array
import java.util.*;
public class Remove_Duplicate{
	public int removeDuplicates(int[] nums){
		// i is the index of new array and j is the index of old array
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int n = new Remove_Duplicate().removeDuplicates(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(n);
	}
}