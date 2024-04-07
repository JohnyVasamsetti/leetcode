// printing the spriral pattern of a 2-D array.
import java.util.*;
public class Spiral_Pattern{
	public static void Spiral(int[][] nums){
		// printing whole array
		for (int i=0;i<nums[0].length;i++ ) {
			System.out.println(Arrays.toString(nums[i]));
		}
		
		int T = 0,L=0,B=nums.length - 1,R = nums[0].length -1,dir=0;
		while(T <= B && L <= R){
			// Left to Right
			for (int i=L;i<=R;i++ ) {
				System.out.print(nums[T][i]);
			}
			T++;

			// Top to Bottom
			for (int i=T;i<=B;i++ ) {
				System.out.print(nums[i][R]);
			}
			R--;

			// Rigth to Left
			for (int i=R;i>=L;i--) {
				System.out.print(nums[B][i]);
			}
			B--;

			// Bottom to Top
			for (int i=B;i>=T;i--) {
				System.out.print(nums[i][L]);
			}
			L++;

		}
	}
	public static void main(String[] args) {
		int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Spiral(nums);
	}
}