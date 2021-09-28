class ListNode{
	int val;
	ListNode next;
	ListNode(){
		this.val = 0;
		this.next = null;
	}
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}
public class Two_Numbers{
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0),temp = l3,head;
		int n = 0;
        while(l1 != null || l2 != null){
        	int x=0,y=0;
        	if (l1 != null){
        		x = l1.val;
        		l1=l1.next;
        	}
        	if (l2 != null){
        		y = l2.val;
        		l2=l2.next;
        	}
        	temp.next = new ListNode( ((x +y + n)%10));
        	n = (x + y + n)/10;
        	temp = temp.next;
        }
        if(n != 0){
        	temp.next = new ListNode(n);
        }
        return l3.next;
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l3 = addTwoNumbers(l1,l2);
		while(l3 != null){
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
}