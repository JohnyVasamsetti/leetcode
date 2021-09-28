// 993. Cousins in Binary Tree
/*

1.Way
public boolean isCousins(TreeNode root, int x, int y) {
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            boolean findX=false, findY=false;
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                findX = findX || x==node.val;
                findY = findY || y==node.val;
                if(!checkChildren(node, x, y))  return false;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(findX || findY)  return findX==findY;   
        }
        return false;
    }
    
    private boolean checkChildren(TreeNode node, int x, int y){
        return node.left==null || node.right==null ||
            !((node.left.val==x && node.right.val==y) || 
              (node.left.val==y && node.right.val==x));
    }
}

2.Way
public boolean isCousins(TreeNode root, int x, int y) {
        return findDepth(root,x,1) == findDepth(root,y,1) && !isSibling(root,x,y); 
    }
    
    private boolean isSibling(TreeNode node, int x, int y) {
        if(node == null) return false;
        
        boolean check = false;
        if(node.left != null && node.right != null){
            check = (node.left.val == x && node.right.val == y) ||
                    (node.left.val == y && node.right.val == x);
        }
        return check || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
    
    private int findDepth(TreeNode node, int val, int height) {
        if(node == null) return 0;
        if(node.val == val) return height;
        
        return findDepth(node.left, val, height + 1) | 
               findDepth(node.right, val, height + 1);
    }
}
*/

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

public class Cousins{
	public boolean isCousins(TreeNode root, int x, int y) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
        if (root==null)
            return false;
        LinkedList<TreeNode> curr = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        curr.offer(root);
        while(!curr.isEmpty()){
            ArrayList<Integer> nums = new ArrayList<Integer>();
            TreeNode front = curr.poll();
            if (front.left != null){
                nums.add(front.left.val);
                next.add(front.left);
            }
            if (front.right != null){
                nums.add(front.right.val);
                next.add(front.right);
            }
            lst.add(nums);
            if (curr.isEmpty()){
                for (int i = 0;i<lst.size();i++) {
                    ArrayList<Integer> temp = lst.get(i);
                    if (temp.contains(x) || temp.contains(y)){
                        int other = y;
                        if (temp.contains(y)){
                            other = x;
                        }
                        for (int j = i+1;j<lst.size();j++) {
                            ArrayList<Integer> temp2 = lst.get(j);
                            if (temp2.contains(other)){
                                return true;
                            }
                        }
                        return false;
                    }
                }
                curr = next;
                next = new LinkedList<TreeNode>();
                lst = new ArrayList<ArrayList<Integer>>();
            }
        }
        return false;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
  //       root.right.left.left = new TreeNode(null);
		// root.right.right.right = new TreeNode(null);
		System.out.println(new Cousins().isCousins(root,4,5));
	}
}