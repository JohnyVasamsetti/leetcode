// 82. Remove Duplicates from Sorted List II
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
        ListNode temp = head,prev,start;
        while(true){
        	prev = temp;
        	temp = temp.next;
        	int count = 0;
        	while(temp != null && temp.val == prev.val){
        		temp = temp.next;
        		count++;
        	}
        	if(count == 0){
        		
        	}
        	prev.next = temp;
        	if (temp == null)
        		break;
        }
        return head;
    }
	public static void main(String[] args) {
		ListNode ls = new ListNode(1);	
		ls.next = new ListNode(2);
		ls.next.next = new ListNode(2);	
		ls.next.next.next = new ListNode(3);	
		ls.next.next.next.next = new ListNode(5);
		ls.next.next.next.next.next = new ListNode(5);
		ls.next.next.next.next.next.next = new ListNode(6);
		ListNode lst = deleteDuplicates(ls);
		while(lst != null){
			System.out.println(lst.val);
			lst = lst.next;
		}
	}
}