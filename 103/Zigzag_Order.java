// 103. Binary Tree Zigzag Level Order Traversal

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

public class Zigzag_Order{
	public List<List<Integer>> zigzaglevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        if (root==null)
            return lst;
        List<Integer> nums = new ArrayList<Integer>();
        LinkedList<TreeNode> curr = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        curr.offer(root);
        boolean turn = false;
        while(!curr.isEmpty()){
        	TreeNode fr = curr.poll();
        	nums.add(fr.val);

        	if (fr.left!= null){
        		next.offer(fr.left);
        	}
        	if (fr.right!= null){
        		next.offer(fr.right);
        	}
        	if (curr.isEmpty()){
                curr = next;
                if (turn)
                    Collections.reverse(nums);
                turn = !turn;
                lst.add(nums);
                nums = new ArrayList<Integer>();
                next = new LinkedList<TreeNode>();
            }
        }
        return lst;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
  //       root.right.left.left = new TreeNode(null);
		// root.right.right.right = new TreeNode(null);
		System.out.println(new Zigzag_Order().zigzaglevelOrder(root));
	}
}