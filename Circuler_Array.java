// find an element in the circular sorted array.
public class Circuler_Array{
	public static int Find(int[] nums , int found){
		int low = 0 , high = nums.length - 1;
		while(low <= high){
			int mid = (int)(low + high)/2;
			// if the target found at mid index
			if (nums[mid]==found){
				return mid;
			}
			// if right half `A[mid…high]` is sorted and `mid` is not the target element
			else if (nums[mid] <= nums[high] ){
				// compare target with `A[mid]` and `A[high]`to know if it lies in `A[mid…high]` or not
				if (found > nums[mid] && found <= nums[high]){
					low = mid + 1; // go searching in the right sorted half
				}
				else{
					high  = mid -1; // go searching left
				}
			}
			// if left half `A[low…mid]` is sorted, and `mid` is not the target element
			else{
				// compare target with `A[low]` and `A[mid]` to know if it lies in `A[low…mid]` or not
				if (found >= nums[low] && found < nums[mid]){
					high = mid -1;  // go searching in the left sorted half
				}
				else{
					low = mid + 1; // go searching right
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums =new int[]{8,9,10,1,4,5,7};
		System.out.println(Find(nums,14));
	}
}