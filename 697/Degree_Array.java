// 697. Degree of an Array

import java.util.*;
public class Degree_Array{
	public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
        int count = 0,len=Integer.MAX_VALUE;
        int []temp;
        boolean flag = false;
        for (int i=0;i<nums.length;i++) {
        	if (map.containsKey(nums[i])){
        		flag = true;
        		temp = map.get(nums[i]);
        		map.put(nums[i],new int[]{temp[0]+1,temp[1]});
        		if (temp[0] > count){
        			count = temp[0];
        			len = i - temp[1] + 1;
        		}
        		else if(temp[0] == count && (i - temp[1] + 1) < len ){
        			len = i - temp[1] + 1;	
        		}
        	}
        	else{
        		map.put(nums[i],new int[]{1,i});
        	}
        }
        if (flag)
        	return len;
        return 1;
    }
	public static void main(String[] args) {
		System.out.println(new Degree_Array().findShortestSubArray(new int[]{1}));
	}
}