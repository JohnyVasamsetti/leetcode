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
public class Balanced_BST{
	public static boolean isBalanced(TreeNode root) {
        if (root == null)
        	return true;
        if (Math.abs(getHeight(root.left)-getHeight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right))
        	return true;
        return false;
    }
    public static int getHeight(TreeNode root){
    	if (root == null)
    		return 0;
    	return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root = new TreeNode(1); 
        root.left = new TreeNode(2); 
        root.right = new TreeNode(3); 
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(5); 
        root.left.left.left = new TreeNode(8);
        System.out.println(isBalanced(root));
	}
}