import java.util.HashMap;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        HashMap<String, Integer> availableChars = new HashMap<String, Integer>(0);
        int count = 0;
        boolean clear;
        // Iterate through all collections of characters, populate map with all characters in the array
        for (String s : headlines) {
            for (String c : s.trim().split(" ")) {
                for (String l : c.split("")) {
                    String ll = l.toLowerCase();
                    if (availableChars.containsKey(ll)) {
                        availableChars.replace(ll, availableChars.get(ll)+1);
                    }
                    else {
                        availableChars.put(ll.toLowerCase(), 1);
                    }
                }
            }
        }
        for (String m : messages) {
            clear = true;
            HashMap<String, Integer> messageAvailability = new HashMap<String, Integer>(0);
            for (String s : m.trim().split(" ")) {
                if (s.equals("")) {
                    count++;
                }
                for (String c : s.split("")) {
                    String cl = c.toLowerCase();
                    if (messageAvailability.containsKey(cl)) {
                        messageAvailability.replace(cl, messageAvailability.get(cl)+1);
                    }
                    else {
                        messageAvailability.put(cl.toLowerCase(), 1);
                    }
                }
            }
            System.out.println(messageAvailability.toString());
            for (String x : messageAvailability.keySet()) {
                if (!availableChars.containsKey(x) || availableChars.get(x) < messageAvailability.get(x)) {
                    System.out.println("break");
                    clear = false;
                    break;
                }
            }
            if (clear) {
                count++;
            }
            if (messageAvailability.containsKey("") && availableChars.containsKey("")) {
                count--;
            }
            messageAvailability.clear();
        }
        System.out.println(count);
        return count;
    }
 }
