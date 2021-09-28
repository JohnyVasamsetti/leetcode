// 116. Populating Next Right Pointers in Each Node
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
	public Node connect(Node root) {
        if (root == null)
        	return null;
        if (root.left != null){
        	root.left.next = root.right;
        }
        if(root.right != null){
        	root.right.next = root.next!=null ? root.next.left:null;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
	}
}