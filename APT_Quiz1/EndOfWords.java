package APT_Quiz1;

import java.util.*;

public class EndOfWords {

    public static String[] filter(String[] words){
        List<String> chars = new ArrayList<>(0);
        List<String> container = new ArrayList<>(0);
        for (int i = 0; i < words.length; i++) {
            if (words[i].substring(0,1).equals(words[i].substring(words[i].length()-1,words[i].length()))) {
                if (! chars.contains(words[i].substring(0,1))) {
                    chars.add(words[i].substring(0,1));
                    container.add(words[i]);
                }
            }
        }
        String[] ret = new String[container.size()];
        for (int s = 0; s < container.size(); s++) {
            ret[s] = container.get(s);
        }
        return ret;
    }

}