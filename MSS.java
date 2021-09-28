// finding the maximum sum subarray. bruteforce
public class MSS{
	public static int Mss(int arr[],int n){
		int ans = Integer.MIN_VALUE;
		for (int size = 1; size <= n;size++) {
			for (int start = 0; start < n;start++ ) {
				if ( (start + size) > n)
					break;
				int sum = 0;
				for (int i=start;i<(start+size) ;i++ ) {
					sum+=arr[i];
				}
				ans = Math.max(ans,sum);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = new int[]{1,-3,5,3,-5,7-8};
		System.out.println(Mss(arr,arr.length));
	}
}