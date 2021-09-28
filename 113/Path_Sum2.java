// 113. Path Sum II

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
public class Path_Sum2{
	private void DFS(TreeNode root, int targetSum,List<List<Integer>> lst,List<Integer> curr) {
		if (root == null){
			return;
		}
		curr.add(root.val);
		if (root.left == null && root.right == null){
			if (targetSum == root.val){
				lst.add(new ArrayList<>(curr));
			}
			curr.remove(curr.size()-1);
			return;
		}
        DFS(root.left,targetSum-root.val,lst,curr);
        DFS(root.right,targetSum-root.val,lst,curr);
        curr.remove(curr.size()-1);
    }
	public List<List<Integer>> pathSum(TreeNode root, int targetSum){
		List<List<Integer>> lst = new ArrayList<>();
		List<Integer> curr = new ArrayList<>();
		DFS(root,targetSum,lst,curr);
		return lst;
	} 
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		System.out.println(new Path_Sum2().pathSum(root,22));
	}
}
