// 637. Average of Levels in Binary Tree

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Level_Average{
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> nums = new ArrayList<Double>();
        if (root == null){
        	return nums;
        }
        double sum = 0;
        int count = 0;
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        current.offer(root);
        while(!current.isEmpty()){
        	TreeNode front = current.poll();
        	sum += front.val;
        	count++;
        	if (front.left != null)
        		next.offer(front.left);
        	if(front.right != null)
        		next.offer(front.right);
        	if(current.isEmpty()){
        		current = next;
        		nums.add(sum/count);
        		next = new LinkedList<TreeNode>();
        		sum = 0;
        		count = 0;
        	}
        }
        return nums;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(new Level_Average().averageOfLevels(root));
	}
}