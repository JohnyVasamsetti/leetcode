import java.util.*;
public class Triangle{
	/** 
	public int helper(List<List<Integer>> triangle,int rowNum ,int index){
		List<Integer> curr = triangle.get(rowNum);
		int curr_val = curr.get(index);
		if (rowNum == triangle.size()-1) return curr_val;
		int left = helper(triangle,rowNum+1,index);
		int right = helper(triangle,rowNum+1,index+1);
		return curr_val + Math.min(left,right);
	}
	public int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle,0,0);
    }
    **/

    public int minimumTotal(List<List<Integer>> triangle){
    	int rows = triangle.size();
    	int[] dp = new int[rows];
    	for (int i=rows-1;i>=0;i--) {
    		for (int j=0;j<=i;j++) {
    			if(i == rows -1)
    				dp[j] = triangle.get(i).get(j);
    			else
    				dp[j] = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
    		}
    	}
    	return dp[0];
    }
	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(new ArrayList<Integer>(){{add(2);}});
		triangle.add(new ArrayList<Integer>(){{add(3);add(4);}});
		triangle.add(new ArrayList<Integer>(){{add(6);add(5);add(7);}});
		triangle.add(new ArrayList<Integer>(){{add(4);add(1);add(8);add(3);}});
		System.out.println(new Triangle().minimumTotal(triangle));
	}
}