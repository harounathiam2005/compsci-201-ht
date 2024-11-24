import java.util.*;

public class WeightedListSorter {
    public String[] sort (String[] words, ListNode weights) {
        Map<String, Integer> map = new HashMap<>(0);
        int i = 0;
        while (weights.next != null) {
            map.put(words[i], weights.info);
            weights = weights.next;
            i++;
        }
        Arrays.sort(words, (c1,c2) -> {
            if (map.get(c2) - map.get(c1) == 0) {
                return c2.compareTo(c1);
            }
            return map.get(c2) - map.get(c1); 
        });
        return words;
    }
}
