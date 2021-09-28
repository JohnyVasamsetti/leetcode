// Finding the occurences of a duplicates in the sorted list
import java.util.*;
public class Occur_Dupe{
	public static int Dupes(int[] nums,int found,boolean b){
		int low=0,high=nums.length-1,result=-1;
		while(low <= high){
			int mid = (int)(low+high)/2;
			System.out.println(mid);
			if (nums[mid] == found){
				if (b){
					result = mid;
					low = mid + 1;
				}
				else{
					result = mid;
					high = mid - 1;
				}
			}
			else if (found < nums[mid]){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,3,3,4,5,6};
		int found = 3;
		int l = Dupes(nums,found,true);
		System.out.println("l " + l);
		if ( l != -1)
			System.out.println( l - Dupes(nums,found,false) + 1);
		else{
			System.out.println(0);
		}
	}
}