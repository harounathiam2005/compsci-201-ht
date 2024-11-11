import java.util.*;

public class SyllableSorting {

    public String[] sortWords(String[] words) {
        ArrayList<ArrayList<String>> syllablesCollection = new ArrayList<>();
        ArrayList<ArrayList<String>> originalSyllables = new ArrayList<>();
    
        // Step 1: Split each word into syllables
        for (String word : words) {
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            int i = 0;
            int last = 0;
    
            // Split the word into syllables
            while (i < word.length()) {
                if (vowels.contains(word.charAt(i))) {
                    // Ensure that we capture consonants followed by vowels as a syllable
                    if (i + 1 < word.length() && !vowels.contains(word.charAt(i + 1))) {
                        list.add(word.substring(last, i + 1));
                        last = i + 1;
                    }
                }
                i++;
            }
    
            // Capture any remaining syllables
            if (last < word.length()) {
                list.add(word.substring(last));
            }
    
            syllablesCollection.add(new ArrayList<>(list));  // Keep the original for tie-breaking
            Collections.sort(list);  // Sort alphabetically for comparison
            originalSyllables.add(list);  // Store sorted list
        }
    
        // Step 2: Sort the words based on the sorted syllables and, if needed, by the original order
        String[] sortedWords = words.clone();  // Clone to sort the original word array
    
        Arrays.sort(sortedWords, (w1, w2) -> {
            int idx1 = Arrays.asList(words).indexOf(w1);
            int idx2 = Arrays.asList(words).indexOf(w2);
    
            // Get sorted syllables for both words
            ArrayList<String> sortedSyllables1 = syllablesCollection.get(idx1);
            ArrayList<String> sortedSyllables2 = syllablesCollection.get(idx2);
    
            // Compare sorted syllables lexicographically
            int cmp = compareSyllables(sortedSyllables1, sortedSyllables2);
            
            if (cmp != 0) {
                return cmp;
            } else {
                // If sorted syllables are the same, compare original syllables lexicographically
                ArrayList<String> originalSyllables1 = originalSyllables.get(idx1);
                ArrayList<String> originalSyllables2 = originalSyllables.get(idx2);
                return compareSyllables(originalSyllables1, originalSyllables2);
            }
        });
    
        return sortedWords;
    }
    
    // Helper method to compare syllables lexicographically
    private int compareSyllables(ArrayList<String> syllables1, ArrayList<String> syllables2) {
        int minLen = Math.min(syllables1.size(), syllables2.size());
        for (int i = 0; i < minLen; i++) {
            int cmp = syllables1.get(i).compareTo(syllables2.get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return Integer.compare(syllables1.size(), syllables2.size());  // If one is longer, it's greater
    }

}

/* 
            System.out.println(list.size());
            String[] out = list.toArray(new String[list.size()]);
            for (String s : out) {
                System.out.println(s);
            }
                */