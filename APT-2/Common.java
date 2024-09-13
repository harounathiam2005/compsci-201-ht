import java.util.ArrayList;

public class Common {
    public int count (String a, String b) {
        String[] arr1 = new String[a.split("").length];
        arr1 = a.split("");
        String[] arr2 = new String[b.split("").length];
        arr2 = b.split("");
        ArrayList<String> chars = new ArrayList<String>(0);
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int x = 0; x < arr2.length; x++) {
                if (arr1[i].equals(arr2[x])) {
                    count++;
                }
            }
        }
        return count;
    }
 }