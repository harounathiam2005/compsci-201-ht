public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].substring(0,1).equals(first)) {
                count++;
            }
        }
        return count;
    }
}