import java.util.*;

public class FriendsScore {
    public int highestScore(String[] friends) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp;
        for (int i = 0; i < friends.length; i++) {
            temp = new ArrayList<>();
            for (int x = 0; x < friends[i].length(); x++) {
                String currentLetter = friends[i].substring(x,x+1);
                if (currentLetter.equals("Y")) {
                    list.set(i,list.get(i)+1);
                    temp.add(x);
                }
            }
            for (int k = 0; k < friends.length; k++) {
                if (!temp.contains(k)) continue;
                
            }
        }
    }
}
