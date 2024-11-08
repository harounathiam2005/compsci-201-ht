
import java.util.*;

public class AlphaLength {
    public ListNode create(String[] words) {
        String[] uniqueWords = new HashSet<String>(Arrays.asList(words)).toArray(new String[0]);
        Arrays.sort(uniqueWords);
        ListNode head = new ListNode(uniqueWords[0].length(), null);
        ListNode list = head;
        for (int i = 1; i < uniqueWords.length; i++) {
            list.next = new ListNode(uniqueWords[i].length(), null);
            list = list.next;
        }
        return head;
    }
}
