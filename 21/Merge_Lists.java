// 21. Merge Two Sorted Lists
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Merge_Lists{
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
        ListNode current =  temp;
        while(l1 != null && l2 != null){
            if (l1.val > l2.val){
                current.next = l2;
                l2 = l2.next;
            }
            else{
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        if(l2 != null){
            current.next = l2;
            l2=l2.next;
        }
        if(l1 != null){
            current.next = l1;
            l1=l1.next;
        }
        return temp.next;
    }
    public static void main(String[] args) {
    	ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
    	l1.next.next = new ListNode(5);
        
    	ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode t = mergeTwoLists(l1,l2);
        while(t!= null){
            System.out.println(t.val);
            t = t.next;
        }
    	System.out.println(mergeTwoLists(l1,l2).next.next.val);
    }
}