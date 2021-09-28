// finding the how many times the array is rotated
public class Rotation_Array{
	public static int Rotation(int[] nums){
		int low=0 , n = nums.length , high=n - 1;
		if (nums[low] <= nums[high]){
			return low;
		}
		int mid = low;
		while(low <= high){
			mid = (int)(low+high)/2;
			// checking if mid-1 and mid+1 elements are greater then mid 
			if (nums[(mid+n-1)%n] >= nums[mid] && nums[(mid+1)%n] >= nums[mid]){
				return mid;
			}
			else if (nums[mid] <= nums[high]){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{8,9,10,1,2,3,4};
		System.out.println(Rotation(nums));
	}
}