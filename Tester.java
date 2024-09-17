import java.util.HashMap;

public class Tester {
    public static void main(String[] args) {
        String[] words = {"one fish two", "fish red fish blue", "fish this fish is black"};

        most(words);
    }

    public static String most(String[] sentences) {
        HashMap<String, Integer> map = new HashMap<String, Integer>(0);
        for (String s : sentences) {
            for (String w : s.split(" ")) {
                if (map.containsKey(w)) {
                    map.replace(w, map.get(w)+1);
                }
                else {
                    map.put(w, 1);
                }
            }
        }
        System.out.println(map.toString());
        return "";
    }

}