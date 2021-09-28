// 11. Container With Most Water
public class Water{
	public static int maxArea(int[] height) {
		int max = 0,c;
    	for (int i=0;i<height.length;i++) {
    		for (int j=i+1;j<height.length;j++ ) {
    			max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
    		}
    	}
    	return max;
    }
	public static void main(String[] args) {
		int[] arr = new int[]{4,3,2,1,4};
		System.out.println(maxArea(arr));
	}
}