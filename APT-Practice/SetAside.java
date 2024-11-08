import java.util.*;

public class SetAside {

    public String common(String[] list) {
        Map<String,Integer> map = new HashMap<>(0);
        StringBuilder ret = new StringBuilder();
        int threshold = list.length;
        for (int i = 0; i < list.length; i++) {
            ArrayList<String> items = new ArrayList<>(new HashSet<>(Arrays.asList(list[i].split(" "))));
            for (int x = 0 ; x < items.size(); x++) {
                if (!map.containsKey(items.get(x))) {
                    map.put(items.get(x), 1);
                }
                else {
                    map.replace(items.get(x), map.get(items.get(x))+1);
                }
            }
        }
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (int k = 0; k < map.keySet().size(); k++) {
            if (map.get(keys.get(k)) == threshold) {
                ret.append(keys.get(k));
                ret.append(" ");
            }
        }
        return ret.toString().trim();
    }
}