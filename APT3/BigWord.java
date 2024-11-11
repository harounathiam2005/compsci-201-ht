import java.util.HashMap;

public class BigWord {
    public String most(String[] sentences) {
        HashMap<String, Integer> map = new HashMap<String, Integer>(0);
        for (String s : sentences) {
            for (String w : s.split(" ")) {
                String wl = w.toLowerCase();
                if (map.containsKey(wl)) {
                    map.replace(wl, map.get(wl)+1);
                }
                else {
                    map.put(wl, 1);
                }
            }
        }
        System.out.println(map.toString());
        int max = 0;
        for (String k : map.keySet()) {
            if (map.get(k) > max) {
                max = map.get(k);
            }
        }
        for (String l : map.keySet()) {
            if (map.get(l).equals(max)) {
                System.out.println(l);
                return l;
            }
        }
        return "";
    }
}