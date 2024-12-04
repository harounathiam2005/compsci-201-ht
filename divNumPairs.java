import java.util.*;

public class divNumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // nested loop: for n { for k = n-1 }
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        ArrayList<Integer> added;

        for (int i = 0; i < n; i++) {
            for (int x = i; x < n; x++) {
                added = new ArrayList<>();
                added.add(ar.get(i));
                added.add(ar.get(x));
                if (ar.get(i) + ar.get(x) % k == 0) {
                    pairs.add(added);
                }
            }
        }

        return pairs.size();
    }
}
