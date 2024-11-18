import java.util.*;

public class Measuring {
    
    public int[] calculate(String[] data) {
        Set<String> set = new HashSet<>(0);
        int[] ret = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (set.contains(data[i])) {
                ret[i] = 0;
            }
            else {
                ret[i] = data[i].length();
                set.add(data[i]);
            }
        }
        return ret;
    }

}
