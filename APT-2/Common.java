//import java.util.ArrayList;
import java.util.HashMap;

public class Common {
    public int count (String a, String b) {
        HashMap<String, Integer> mapA = new HashMap<String, Integer>(0);
        HashMap<String, Integer> mapB = new HashMap<String, Integer>(0);
        //ArrayList<String> returnChars = new ArrayList<String>(0);
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (mapA.keySet().contains(b.substring(i,i+1))) {
                mapA.replace(b.substring(i,i+1), mapA.get(b.substring(i,i+1))+1);
            }
            else {
                mapA.put(b.substring(i,i+1),1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (mapB.keySet().contains(a.substring(i,i+1))) {
                mapB.replace(a.substring(i,i+1), mapB.get(a.substring(i,i+1))+1);
            }
            else {
                mapB.put(a.substring(i,i+1),1);
            }
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
 }