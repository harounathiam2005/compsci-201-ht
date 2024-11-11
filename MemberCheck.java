import java.util.*;
// O(N) time complexity
public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        ArrayList<String> ret = new ArrayList<>(0);
        HashMap<String, Integer> members = new HashMap<String, Integer>(0);
        HashSet<String> clubSet1 = new HashSet<String>(0);
        HashSet<String> clubSet2 = new HashSet<String>(0);
        HashSet<String> clubSet3 = new HashSet<String>(0);
        ArrayList<String> clubs = new ArrayList<>(0);
        for (String s : club1) {
            clubSet1.add(s);
        }
        clubs.addAll(clubSet1);
        for (String s : club2) {
            clubSet2.add(s);
        }
        clubs.addAll(clubSet2);
        for (String s : club3) {
            clubSet3.add(s);
        }
        clubs.addAll(clubSet3);
        for (String s : clubs) {
            if (members.containsKey(s)) {
                members.replace(s, members.get(s)+1);
            }
            else {
                members.put(s,1);
            }
        }
        for (String s : members.keySet()) {
            if (members.get(s) > 1) {
                ret.add(s);
            }
        }
        String[] returnArray = ret.toArray(new String[ret.size()]);
        Arrays.sort(returnArray);
        return returnArray;
    }
 }
