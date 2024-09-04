public class Tester {

    public static void main(String[] args) {
        String[] words = new String[6];

        words[0] = "words";
        words[1] = "apple";
        words[2] = "animal";
        words[3] = "dog";
        words[4] = "abraham";
        words[5] = "wizard";

        System.out.println(begins(words, "e"));
    }

    public static int begins(String[] words, String first) {
        int count = 0;
        for (String var : words) {
            if (var.substring(0,1).equals(first)) {
                count++;
            }
        }
        return count;
    }

}