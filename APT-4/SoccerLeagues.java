public class SoccerLeagues {

    public int[] points(String[] matches) {
        int[] scores = new int[matches.length];
        for (int i = 0; i < matches.length; i++) {
            for (int x = 0; x < matches[i].length(); x++) {
                if (matches[i].substring(x,x+1).equals("-")) {
                    continue;
                }
                if (matches[i].substring(x,x+1).equals("W")) {
                    scores[i] += 3;
                }
                if (matches[i].substring(x,x+1).equals("L")) {
                    scores[x] += 3;
                }
                if (matches[i].substring(x,x+1).equals("D")) {
                    scores[x]++;
                    scores[i]++;
                }
            }
        }
        return scores;
    }
    
}
