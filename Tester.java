import java.util.HashMap;

public class Tester {
    public static void main(String[] args) {
        String[] words =  {"6G9Lnpzw", "kA", "SyW9fFaF", "k", "SyW9fFa", "6G", "6", "SyW9f"};

        isOne(words);
    }

    public static String isOne(String[] words) {
        HashMap<String, Integer> map = new HashMap<String, Integer>(0);
        if (words.length == 1) {
            return "Yes";
        }
        for (int i = 0; i < words.length; i++) {
            for (int x = 0; x < words.length; x++) {
                if (x == i) {
                    continue;
                }
                if (words[x].length() < words[i].length() && words[x].equals(words[i].substring(0,words[x].length()))) {
                    map.put(words[x], x);
                }
            }
        }
        int min = 50;
        for (String s : map.keySet()) {
            if (map.get(s) < min) {
                min = map.get(s);
            }
        }
        for (String s : map.keySet()) {
            if (min == map.get(s)) {
                System.out.println("No, " + map.get(s));
                return "No, " + map.get(s);
            }
        }
        System.out.println("Yes");
        return "Yes";
    }

}