import java.util.*;

public class Closet {

    /* 
public static void main(String[] args) {
    String[] words = {"a b c d", "b c d", "b c d e", "b c f"};

    System.out.println(anywhere(words));
}
*/

    public String anywhere(String[] list) {
        StringBuilder ret = new StringBuilder();
        Set<String> set = new HashSet<>(0);
        for (int i = 0; i < list.length; i++) {
            set.addAll(new ArrayList<>(new HashSet<>(Arrays.asList(list[i].split(" ")))));
        }
        List<String> arr = new ArrayList<>(set);
        Collections.sort(arr);
        for (int x = 0; x < arr.size(); x++) {
            ret.append(arr.get(x));
            ret.append(" ");
        }
        return ret.toString().trim();
    }
}