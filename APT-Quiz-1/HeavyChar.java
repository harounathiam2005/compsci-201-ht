import java.util.*;

public class HeavyChar {
    public String[] weight(String[] words,
                           String letter,
                           int minChars){
        List<String> list = new ArrayList<>(0);
        for (int i = 0; i < words.length; i++) {
            List<String> chars = new ArrayList<>(Arrays.asList(words[i].split("")));
            if (Collections.frequency(chars, letter) > minChars) {
                list.add(words[i]);
            }
        }
        String[] ret = new String[list.size()]; 
        for (int x = 0; x < ret.length; x++) {
            ret[x] = list.get(x);
        }        
        return ret;
    }
}
