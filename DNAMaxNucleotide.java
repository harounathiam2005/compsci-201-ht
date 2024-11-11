import java.util.ArrayList;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int[] letters = new int[strands.length];
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