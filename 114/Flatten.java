// 114. Flatten Binary Tree to Linked List
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
public class Flatten{
	public static void flatten(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
        while(curr != null || !stack.empty()){
        	if(curr.right != null)
        		stack.push(curr.right);
        	if(curr.left != null){
        		curr.right = curr.left;
        		curr.left = null;
        	}
        	else if (!stack.empty()){
        		curr.right = stack.pop();
        	}
        	curr = curr.right;
        }
    }
    public static void preorder(TreeNode root){
    	if (root == null)
    		return;
    	System.out.println(root.val);
    	preorder(root.left);
    	preorder(root.right);
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
		// root.left.left.left = new TreeNode(7);
		// root.left.left.right = new TreeNode(2);
		// root.right.right.left = new TreeNode(5);
		// root.right.right.right = new TreeNode(1);
		System.out.println();
		flatten(root);
		preorder(root);
	}
}