// 101. Symmetric Tree

/**
    public static boolean IsMirror(TreeNode node1,TreeNode node2){
        if (node1 == null && node2 == null)
            return true;
        if (node1 != null && node2 != null && node1.val == node2.val && IsMirror(node1.left,node2.right) && IsMirror(node1.right,node2.left))
            return true;
        return false;
    }
    public static boolean isSymmetric(TreeNode root){
        if (IsMirror(root,root))
            return true;
        return false;
    }
**/

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
class Syemmetric_Tree{
    public static boolean isSymmetric(TreeNode root) {
    	if (root == null)
    		return true;
        LinkedList<TreeNode> curr = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        curr.offer(root);
        ArrayList<Integer> array = new ArrayList<Integer>();
        // here array will store the all elements include null values also , 
        // and compare the values of array in such a way that if the elements are symmetric or not.
        while(!curr.isEmpty()){
        	TreeNode front = curr.poll();
        	if (front.left != null){
        		next.offer(front.left);
        		array.add(front.left.val);
        	}
        	else{
        		array.add(null);
        	}
        	if (front.right != null){
        		next.offer(front.right);
        		array.add(front.right.val);
        	}
        	else{
        		array.add(null);
        	}
        	if(curr.isEmpty()){
        		curr =  next;
        		next = new LinkedList<TreeNode>();
        		int j=array.size()-1;
        		for (int i=0;i<array.size()/2;i++) {
        			if(array.get(i) == array.get(j)){
        				j--;
        			}
        			else{
        				return false;
        			}
        		}
        		array = new ArrayList<Integer>();
        	}
        }
        return true;
    }

    
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2); 
        root.right = new TreeNode(2); 
        root.left.left = new TreeNode(3); 
        root.left.right = new TreeNode(4); 
        root.right.left = new TreeNode(4); 
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}