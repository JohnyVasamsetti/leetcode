// finding the merge of a two linked lists.
public class Merge_Point{
	public static int Point(int []A,int B[]){
		int n = A.length;
		int m = B.length;
		int d1 = 0,d2 = 0;
		if (n > m){
			d1 = n - m;
		}
		else{
			d2 = m - n;
		}
		for (int i=0;i<m;i++) {
			if (A[d1 + i] == B[d2 + i]){
				return A[d1 + i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] A = new int[]{1,2,5,7,9};
		int[] B = new int[]{5,7,9};
		System.out.println(Point(A,B));
	}
}