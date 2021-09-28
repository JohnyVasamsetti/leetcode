// 108. Convert Sorted Array to Binary Search Tree
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
public class Array_To_BST{
	static void preOrder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        System.out.print(node.val + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }
	public static TreeNode MakeBST(int [] nums,int first , int last){
		if (first > last){
			return null;
		}
		int mid = (first + last) /  2 ;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = MakeBST(nums,first,mid-1);
		root.right = MakeBST(nums,mid+1,last);

		return root;
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		return  MakeBST(nums,0,nums.length-1);
	}
	public static void main(String[] args) {
		TreeNode root = sortedArrayToBST(new int[] {-3,-2,-1,0,1,2,3});
		preOrder(root);
		sortedArrayToBST(new int[] {-4,-3,-2,-1,0,1,2,3,4});

	}
}