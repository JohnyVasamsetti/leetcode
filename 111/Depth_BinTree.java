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
	public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null){
            return 1+minDepth(root.right);
        }
        if (root.right == null){
            return 1+minDepth(root.left);
        }
        return Math.min(1+minDepth(root.left),1+minDepth(root.right));
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(2);
		// root.left = new TreeNode(null);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.right = new TreeNode(6);
		// root.right.right = new TreeNode(15);
		// root.right.right = new TreeNode(3);
		System.out.println(new Depth_BinTree().minDepth(root));
    }
}