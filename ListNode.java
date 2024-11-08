

public class ListNode {
    int info;
    public ListNode next;
    ListNode(int x){
        info = x;
    }
    ListNode(int x, ListNode node){
        info = x;
	    next = node;
    }
}
