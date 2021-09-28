// 100. Same Tree
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
public class Same_Tree{
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null && q == null)
            return true;
        if (p != null && q != null && p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right))
            return true;
        return false;
    }
    public static void main(String[] args) {
    	TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(9);
		root1.right = new TreeNode(20);
		root1.right.left = new TreeNode(15);
		root1.right.right = new TreeNode(7);

		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(9);
		root2.right = new TreeNode(20);
		root2.right.left = new TreeNode(15);
		root2.right.right = new TreeNode(7);

    	System.out.println(new Same_Tree().isSameTree(root1,root2));
    }
}