
/*
 * public class ListNode {
    int info;
    ListNode next;
    ListNode(int x){
        info = x;
    }
    ListNode(int x, ListNode node){
        info = x;
	    next = node;
    }
}
 */

public class ListCount {
    public int count (ListNode list) {
        if (list == null) {
            return 0;
        }
        if (list.next != null) {
            return count(list.next) + 1;
        }
        return 1;
    }
}