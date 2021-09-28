// 112. Path Sum

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
public class Path_Sum{
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null){
			if (targetSum == 0)
				return true;
			return false;
		}
		if (root.left == null){
			return hasPathSum(root.right,targetSum-root.val);
		}
		if (root.right == null){
			return hasPathSum(root.left,targetSum-root.val);
		}
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
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
		root.right.right.right = new TreeNode(1);
		System.out.println(new Path_Sum().hasPathSum(root,2));
	}
}