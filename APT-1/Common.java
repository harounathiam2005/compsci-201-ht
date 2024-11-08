//import java.util.ArrayList;
import java.util.HashMap;

public class Common {
    public int count (String a, String b) {
        HashMap<String, Integer> mapA = new HashMap<String, Integer>(0);
        HashMap<String, Integer> mapB = new HashMap<String, Integer>(0);
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            populate(mapB, b, i);
            populate(mapA, a, i);
        }
        for (String c : mapA.keySet()) {
            for (String c2 : mapB.keySet()) {
                if (c.equals(c2)) {
                    for (int i = 0; i < Integer.min(mapA.get(c),mapB.get(c2)); i++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void populate(HashMap<String, Integer> map, String s, int index) {
        if (map.keySet().contains(s.substring(index,index+1))) {
            map.replace(s.substring(index,index+1), map.get(s.substring(index,index+1))+1);
        }
        else {
            map.put(s.substring(index,index+1),1);
        }
    }
 }