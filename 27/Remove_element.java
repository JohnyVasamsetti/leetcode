// 27. Remove Element
import java.util.*;
public class Remove_element{
    /**
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    **/
	public int removeElement(int[] nums, int val) {
		int l = nums.length;
        for (int i=0; i<l;i++ ) {
        	if (nums[i] == val){
        		for (int j=i;j<l-1; j++) {
        			nums[j] = nums[j+1];
        		}
        		l--;
        		i--;
        	}
        }
        return l;
    }
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		System.out.println(new Remove_element().removeElement(nums,3));
	}
}