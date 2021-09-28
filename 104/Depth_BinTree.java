// 104. Maximum Depth of Binary Tree

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

public class Depth_BinTree{
	public int maxDepth(TreeNode root) {
        if (root == null)
        	return 0;
        return Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(15);
		root.left.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(3);
		System.out.println(new Depth_BinTree().maxDepth(root));
    }
}