import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        HashSet<String> uniqueAvailable = new HashSet<String>(Arrays.asList(available));
        for (int i = 0; i < orders.length; i++) {
            HashSet<String> thisOrder = new HashSet<String>(Arrays.asList(orders[i].split(" ")));
            int threshold = 0;
            Object[] arr = thisOrder.toArray();
            for (int x = 0; x < arr.length; x++) {
                threshold++;
            }
            int score = 0;
            for (String o : thisOrder) {
                for (String u : uniqueAvailable) {
                    if (o.equals(u)) {
                        score++;
                    }
                }
            }
            if (score >= threshold) {
                return i;
            }
        }
        return -1;
    }
}
