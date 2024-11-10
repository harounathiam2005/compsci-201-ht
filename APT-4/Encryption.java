import java.util.*;

public class Encryption {
    public String encrypt(String message){
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f' ,'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<String, Character> map = new HashMap<>(0);
        int k = 0;
        for (int i = 0; i < message.length(); i++) {
            if (map.containsKey(message.substring(i,i+1))) {
                continue;
            }
            else {
                map.put(message.substring(i,i+1),alphabet[k]);
                k++;
            }
        }
        String ret = "";
        for (int x = 0; x < message.length(); x++) {
            ret += map.get(message.substring(x,x+1));
        }
        return ret; 
    }
}
