import java.util.*;
public class Insert_Position{
	public int searchInsert(int[] nums, int target) {
		int i=0;
        while(i<nums.length && nums[i] < target){
        	i++;
        }
        return i;
    }
	public static void main(String[] args) {
		int[] n = new int[] {1,3,5,6};
		System.out.println(new Insert_Position().searchInsert(n,5));
	}
}