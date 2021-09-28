// 83. Remove Duplicates from Sorted List
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Remove_Dupe{
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;

        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if (prev.val == curr.val){
                prev.next = curr.next; // if dupe is occurred , removing the curr node.We don't need to incr prev because 3'rd element 
                                       // also have the same value
            }
            else{
                prev = prev.next; // incr prev node
            }
            curr = prev.next; // in both conditions we need to increment curr node.
        }
        return head;
    }
	public static void main(String[] args) {
		ListNode ls = new ListNode(2);	
		ls.next = new ListNode(2);
		ls.next.next = new ListNode(2);	
		// ls.next.next.next = new ListNode(3);	
		// ls.next.next.next.next = new ListNode(5);
		// ls.next.next.next.next.next = new ListNode(5);
		// ls.next.next.next.next.next.next = new ListNode(6);
		ListNode lst = deleteDuplicates(ls);
		while(lst != null){
			System.out.println(lst.val);
			lst = lst.next;
		}
	}
}