import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Map<String, Integer> map = new HashMap<>(0);
        for (String d : data) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }
        
    }
 }
