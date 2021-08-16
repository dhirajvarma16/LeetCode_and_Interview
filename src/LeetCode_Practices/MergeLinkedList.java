package LeetCode_Practices;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeLinkedList {

	public static void main(String[] args) {
	
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ptr1= l1;
        ListNode ptr2= l2;
        ListNode dummyNode= new ListNode(-1);
        ListNode ptr3=dummyNode;
        
        while(ptr1!=null && ptr2!=null) {
        	if(ptr1.val < ptr2.val) {
        		ptr3.next=ptr1;
        		ptr1=ptr1.next;
        	} else {
        		ptr3.next=ptr2;
        		ptr2=ptr2.next;
        	}
        	ptr3=ptr3.next;
        }
        
        while(ptr1!=null) {
        	ptr3.next=ptr1;
        	ptr1=ptr1.next;
        	ptr3=ptr3.next;
        }
        while(ptr2!=null) {
        	ptr3.next=ptr2;
        	ptr2=ptr2.next;
        	ptr3=ptr3.next;
        }
		return dummyNode.next;
        
    }

}
