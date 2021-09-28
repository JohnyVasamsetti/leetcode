// 107. Binary Tree Level Order Traversal II
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

public class Level_Order{
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        if (root==null)
            return lst
        List<Integer> nums = new ArrayList<Integer>();
        LinkedList<TreeNode> curr = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        curr.offer(root);
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
                lst.add(nums);
                nums = new ArrayList<Integer>();
                next = new LinkedList<TreeNode>();
            }
        }
        Collections.reverse(lst);
        return lst;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(new Level_Order().levelOrderBottom(root));
	}
}