import java.util.HashMap;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        HashMap<String, Integer> map = new HashMap<String, Integer>(0);
        for (String s : str.split(" ")) {
            if (map.containsKey(s)) {
                map.replace(s, (map.get(s)+1));
            }
            else {
                map.put(s, 1); 
            }
        }
        int[] ret = new int[words.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = 0;
            if (map.containsKey(words[i]) == false) {
                continue;
            }
            ret[i] = map.get(words[i]);
        }
        return ret;
    }
}
