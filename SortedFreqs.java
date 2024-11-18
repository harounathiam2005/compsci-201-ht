import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Arrays.sort(data);
        Map<String, Integer> map = new LinkedHashMap<>(0);
        for (String d : data) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }
        for (String s : map.keySet()) {
            System.out.print(s + ", ");
        }
        System.out.println("");
        int[] ret = new int[map.values().size()];
        int i = 0;
        for (int v : map.values()) {
            ret[i++] = v; 
        }
        return ret;
    }
 }
