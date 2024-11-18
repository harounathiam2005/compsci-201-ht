import java.util.*;

public class TournamentRanker {

    public class Player {
        
        String name;
        int wins;
        Player lostTo;
        String lostToName;

        public Player(String name, int wins, Player lostTo, String lostToName) {
            this.name = name;
            this.wins = wins;
            this.lostTo = lostTo;
            this.lostToName = lostToName;
        }

        public String getName() {
            return this.name;
        }

        public Player getWinner() {
            return this.lostTo;
        }

        public int getWins() {
            return this.wins;
        }

        public int compareTo(Player player) {
            return this.getWins() - player.getWins();
        }

        public void setWins(int wins) {
            this.wins = wins;
        }

        public void setLostTo(Player player) {
            this.lostTo = player;
        }

        public void setLostToName(String name) {
            this.lostToName = name;
        }

        public String getLostToName() {
            return this.lostToName;
        }

        //debugging
        public String toString() {
            return "Name: " + getName() + ", Lost To: " + getLostToName() + ", Wins: " + getWins(); 
        }

        public static int winComparator(Player c1, Player c2) {
            if (c1.getWins() != c2.getWins()) {
                return c1.getWins() - c2.getWins();
            }
            return winComparator(c1.getWinner(), c2.getWinner());
        }

    }

    public String[] rankTeams(String[] names, String[] lostTo) {

        ArrayList<Player> players = new ArrayList<>(0);

        for (int x = 0; x < names.length; x++) {
            players.add(new Player(names[x], 0, null, lostTo[x]));
        }

        for (Player p : players) {
            for (Player x : players) {
                if (p.getLostToName().equals(x.getName())) {
                    p.setLostTo(x);
                    x.setWins(x.getWins() + 1);
                }
            }
        }

        // Sort by lostTo
        Collections.sort(players, (c1,c2) -> {
            return -Player.winComparator(c1, c2);
        });

        String[] ret = new String[players.size()];
        int i = 0;
        for (Player p : players) {
            ret[i++] = p.getName();
        }

        return ret;
    }

}
