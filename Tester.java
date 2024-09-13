import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        String[] nucleo = new String[2];
        nucleo[0] = "atttaaa";
        nucleo[1] = "attttttaa";
        System.out.println(nucleo[0] + ", " + nucleo[1]);
        System.out.println(max(nucleo, "a"));
    }
// return all instances of max letter presences
// if 1: return string
// if more than 1: return string w max length
    public static String max(String[] strands, String nuc) {
        int[] letters = new int[strands.length];
        int[] lengths = new int[strands.length];
        ArrayList<String> finalists = new ArrayList<>(0);
        int wholeCount = 0;
        for (int i = 0; i < strands.length; i++) {
            int count = 0;
            for (int x = 0; x < strands[i].length(); x++) {
                if (strands[i].split("")[x].equals(nuc)) {
                    wholeCount++;
                    count++;
                }
            }
            letters[i] = count;
            lengths[i] = strands[i].length();
        }
        if (wholeCount == 0) {
            System.out.println(wholeCount);
            return "";
        }
        int max = 0;
        for (int j = 0; j < letters.length; j++) {
            if (letters[j] >= max) {
                max = letters[j];
            }
        } 
        for (int x = 0; x < letters.length; x++) {
            if (letters[x] == max) {
                finalists.add(strands[x]);
            }
        }
        int maxLength = 0;
        int returnIndex = 0;
        for (int j = 0; j < finalists.size(); j++) {
            if (finalists.get(j).length() > maxLength) {
                maxLength = finalists.get(j).length();
                returnIndex = j;
            }
        }
        return finalists.get(returnIndex);
    }
}

/*
 * 
        // get index(es) of value(s) in array with the max value
        ArrayList<Integer> largestNumChars = new ArrayList<Integer>(0);
        for (int n = 0; n < letters.length; n++) {
            if (max == letters[n]) {
                largestNumChars.add(n);
            }
        }
        // 
        int max2 = Integer.MIN_VALUE;
        for (int i : largestNumChars) {
            if (lengths[i] > max2) {
                max2 = lengths[i];
            }
        }
        System.out.println(max2);
        System.out.println(lengths.indexOf(max2));
        for (int l : largestNumChars) {
            System.out.println(l);
        }
        return strands[largestNumChars.get(largestNumChars.indexOf(max2))];
 */