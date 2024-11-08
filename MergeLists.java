import java.util.ArrayList;

public class MergeLists {

    public ListNode weave(ListNode a, ListNode b) {
        ArrayList<Integer> arr = new ArrayList<>(0);
        while (a != null) {
            arr.add(a.info);
            arr.add(b.info);
            a = a.next;
            b = b.next;
        }
        ListNode head = new ListNode(arr.get(0), null);
        ListNode list = head;
        for (int i = 1; i < arr.size(); i++) {
            list.next = new ListNode(arr.get(i), null);
            list = list.next;
        }
        return head;
    }

}