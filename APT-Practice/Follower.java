import java.util.*;

public class Follower {
    public int[] follows(String[] words) {
        List<Integer> indexList = new ArrayList<>(0);
        for (int i = 0; i < words.length; i++) {
            for (int x = 0; x < words.length; x++) {
                if (i == x) {
                    continue;
                }
                if (words[i] == words[x]) {
                    indexList.add(i);
                }
            }
        }
        int[] ret = new int[indexList.size()];
        for (int x = 0; x < indexList.size(); x++) {
            ret[x] = indexList.get(x);
        }
        return ret;
    }
}
