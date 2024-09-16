import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> newList = new ArrayList<>();
        for (String s : list) {
            if (newList.contains(s)) {
                continue;
            }
            if (s.length() >= minLength) {
                newList.add(s);
            }
        }
        String[] arr = new String[newList.size()];
        return newList.toArray(arr);
    }
}