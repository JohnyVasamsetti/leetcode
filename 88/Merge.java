// 88. Merge Sorted Array
import java.util.*;
public class Merge{
	// public void merge(int[] nums1, int m, int[] nums2, int n) {
	// 	int i=0,j=0;
 //        while(true){
 //        	if(i >= m+n || j >= n)
 //        		break;
 //        	if(nums1[i] > nums2[j]){
 //        		int c = 0;
 //        		while(j < n && nums1[i] > nums2[j]){ // counting how many ordered numbers are less than second array element
 //        			c++;
 //        			j++;
 //        		}
 //        		int k;
 //        		for (k=m-1+j-c;k>=i;k--) { // making a space for #c no of elements
 //        			nums1[k+c]=nums1[k];
 //        		}
 //        		for (int l=j-c;l<j;l++) { // replace the original elements 
 //        			nums1[i++] = nums2[l];
 //        		}
 //        	}
 //        	else{
 //        		i++;
 //        	}
 //        }
 //        if(j<n){ // if the second array elements are left because of the second array element's are grater than  first array elements.(line 9 condition is false).
 //            i -= (n-j);
 //            while(j < n){
 //                nums1[i++]=nums2[j++];
 //            }
 //        }
 //    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[n+m-1] = nums1[m-1];
                m--;
            }
            else{
                nums1[n+m-1] = nums2[n-1];
                n--;
            }
        }
        while(n >0){
            nums1[n+m-1] = nums2[n-1];
            n--;
        }
    }
	public static void main(String[] args) {
		int[] n1 = new int[]{1,2,3,0,0,0};
		int[] n2 = new int[]{2,5,6};
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println();
		new Merge().merge(n1,3,n2,3);
        System.out.println(Arrays.toString(n1));
	}
}