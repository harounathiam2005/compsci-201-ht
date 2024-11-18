import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        Map<String, Integer> map = new HashMap<>(0);
        for (String d : data) {
            if (! map.containsKey(d)) {
                map.put(d, 1);
            }
            else {
                map.replace(d, map.get(d) + 1);
            }
        }

        Arrays.sort(data, (s1, s2) -> {
            int frequencyCompare = map.get(s2) - map.get(s1);
            if (frequencyCompare == 0) {
                return s1.compareTo(s2);
            }
            return frequencyCompare;
        });

        Set<String> uniqueSortedStrings = new HashSet<>(Arrays.asList(data));

        return uniqueSortedStrings.toArray(new String[0]);
    }
 }