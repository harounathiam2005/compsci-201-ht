import java.util.*;

public class SyllableSorting {

    public String[] sortWords(String[] words) {
        for (String word : words) {
            ArrayList<String> list = new ArrayList<>(0);
            ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            int i = 0;
            int last = 0;
            while (i < word.length()-1) {
                if (vowels.contains(word.charAt(i)) && !vowels.contains(word.charAt(i+1))) {
                    list.add(word.substring(last, i+1));
                    last = i+1;
                }
                i++;
            }
            System.out.println(list.size());
            String[] out = list.toArray(new String[list.size()]);
            for (String s : out) {
                System.out.println(s);
            }
        }
        return new String[3];
    }
}
