import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        HashSet<String> set = new HashSet<String>(0);
        int score = 0;
        for (String p : player) {
            set.add(p);
        }
        for (String p : set) {
            for (String i : dictionary) {
                if (i.equals(p)) {
                    score += Math.pow(p.length(), 2);
                }
            }
        }
        return score;
    }
}