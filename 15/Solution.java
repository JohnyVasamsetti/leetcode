import java.util.*;
public class Solution{
	public static List<List<Integer>> threeSum(int[] nums){
       	List<List<Integer>> temp = new ArrayList<List<Integer>>();
		if(nums == null || nums.length < 3)
			return temp;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++){
			map.put(nums[i],i);
		}
		for (int i=0;i<nums.length-1;i++) {
			for (int j=i;j<nums.length;j++) {
				int s = -(nums[i] + nums[j]);
				if(map.containsKey(s) && map.get(s) != i && map.get(s) != j ){
					List<Integer> values = new ArrayList<Integer>();
					values.add(nums[i]);
					values.add(nums[j]);
					values.add(nums[map.get(s)]);
					temp.add(values);
				}
			}
		}
		return temp;
    }
	public static void main(String[] args) {
		int[] nums = new int[]{-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));	
	}
}