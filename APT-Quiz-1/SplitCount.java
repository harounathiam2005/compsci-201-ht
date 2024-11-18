import java.util.*;

public class SplitCount {
    public String counter(String[] info) {
        Map<String,Integer> map = new HashMap<>(0);
        for (int i = 0; i < info.length; i++) {
            String first = info[i].split(":")[0];
            String second = info[i].split(":")[1];
            if (map.containsKey(first)) {
                map.replace(first, map.get(first) + 1);
            }
            else {
                map.put(first, 0);
            }
            if (map.containsKey(second)) {
                map.replace(second, map.get(second) + 1);
            }
            else {
                map.put(second, 0);
            }
        }
        int max = 0;
        String frequent = "";
        for (String k : map.keySet()) {
            if (map.get(k) > max) {
                frequent = k;
                max = map.get(k);
            }
        }
        return frequent;
    }
}
