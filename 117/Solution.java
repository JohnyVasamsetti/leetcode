// 117. Populating Next Right Pointers in Each Node II
import java.util.*;
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class Solution{
	public Node Find(Node temp){
		while(temp.next != null){
    		if (temp.next.left != null)
    			return temp.next.left;
    		else if (temp.next.right != null)
    			return temp.next.right;
    		temp = temp.next;
    	}
    	return null;
	}
	public Node connect(Node root) {
        if(root == null){
        	return null;
        }
        if (root.left != null){
        	if (root.right != null)
        		root.left.next = root.right;
        	else{
        		root.left.next = Find(root);
        	}
        }
        if (root.right != null){
        	root.right.next = Find(root);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }
	public static void main(String[] args) {

		Node root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);

		root.left.left = new Node(0);
		root.left.right = new Node(7);

		root.right.left = new Node(9);
		root.right.right = new Node(1);

		root.left.left.left = new Node(2);
		// root.left.left.right = new Node(4);
		root.left.right.left = new Node(1);
		root.left.right.right = new Node(0);

		// root.right.left.left = new Node(9);
		// root.right.left.right = new Node(9);
		root.right.right.left = new Node(8);
		root.right.right.right = new Node(8);

		// root.left.left.left.left = new Node(2);
		// root.left.left.left.right = new Node(2);
		// root.left.left.right.left = new Node(4);
		// root.left.left.right.right = new Node(4);
		// root.left.right.left.left = new Node(7);
		// root.left.right.left.right = new Node(1);
		root.left.right.right.left = new Node(7);
		// root.left.right.right.right = new Node(0);

		// new Solution().connect(root);
		preorder(root);
		levelOrderBottom(root);
		System.out.println();
	}
}