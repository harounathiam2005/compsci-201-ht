import java.util.*;

public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        List<Integer> list1 = new ArrayList<Integer>(0);
        List<Integer> list2 = new ArrayList<Integer>(0);
        while (a1 != null) {
            list1.add(a1.info);
            a1 = a1.next;
        }
        while (a2 != null) {
            list2.add(a2.info);
            a2 = a2.next;
        }
        if (list1.equals(list2)) {
            return 1;
        }
        return 0;
    }
}