import java.util.HashMap;

public class Tester {
    public static void main(String[] args) {
        String[] messages =  {"program","programmer","gaming","sing","NO FUN"};
        String[] headlines = {"Programming is fun"};

        howMany(headlines, messages);
    }

    public static int howMany(String[] headlines, String[] messages) {
        HashMap<String, Integer> availableChars = new HashMap<String, Integer>(0);
        int count = 0;
        boolean clear;
        // Iterate through all collections of characters, populate map with all characters in the array
        for (String s : headlines) {
            for (String c : s.split(" ")) {
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
            for (String s : m.split(" ")) {
                for (String c : s.split("")) {
                    String cl = c.toLowerCase();
                    if (messageAvailability.containsKey(c)) {
                        messageAvailability.replace(c, messageAvailability.get(c)+1);
                    }
                    else {
                        messageAvailability.put(c.toLowerCase(), 1);
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
            messageAvailability.clear();
        }
        System.out.println(count);
        return count;
    }

}