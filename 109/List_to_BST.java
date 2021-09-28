
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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

class List_to_BST{
	static void preOrder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        System.out.print(node.val + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }
    public static TreeNode sortedListToBST(ListNode head) {
        if (head == null)
        	return null;
       	if (head.next == null)
       		return new TreeNode(head.val);
       	ListNode fast = head;
       	ListNode slow = head;
       	ListNode mid = slow;
       	while(fast != null && fast.next != null){
       		mid = slow; // mid is used to split the List by updating the mid.next to null.
       		fast = fast.next.next; // incr by 2 positions
       		slow = slow.next; // incr by 1 position , finally will be the mid position.
       	}
       	mid.next = null; // breaking the list into two parts , 1.head to mid 2. slow.next to final position
       	TreeNode root = new TreeNode(slow.val);
       	root.left = sortedListToBST(head);
       	root.right = sortedListToBST(slow.next);

       	return root;

    }
    public static void main(String[] args) {
    	ListNode head = new ListNode(-3);
    	head.next= new ListNode(-2);
    	head.next.next= new ListNode(-1);
    	head.next.next.next= new ListNode(0);
    	head.next.next.next.next= new ListNode(1);
    	head.next.next.next.next.next= new ListNode(2);
    	head.next.next.next.next.next.next= new ListNode(3);
    	TreeNode root = sortedListToBST(head);
		preOrder(root);
    }
}