import java.util.*;

public class MedalTable {
    public String[] generate(String[] results) {
        Map<String, ArrayList<Integer>> map = new HashMap<>(0);
        for (String s : results) {
            System.out.print(s + " ");
        }
        System.out.println("");
        for (String m : results) {
            String[] matches = m.split(" ");
            for (int i = 0; i < 3; i++) {
                if (! map.containsKey(matches[i])) {
                    ArrayList<Integer> list = new ArrayList<>(3);
                    list.add(0);
                    list.add(0);
                    list.add(0);
                    map.put(matches[i], list);
                    map.get(matches[i]).set(i,map.get(matches[i]).get(i)+1);
                }
                else {
                    map.get(matches[i]).set(i,map.get(matches[i]).get(i)+1);
                }
            }
        }
        String[] teams = new String[map.keySet().size()];
        int i = 0;
        for (String k : map.keySet()) {
            teams[i++] = k;
        }
        Arrays.sort(teams, (c2,c1) -> {
            int comparator = map.get(c1).get(0) - map.get(c2).get(0);
            if (comparator != 0) return comparator;
    
            comparator = map.get(c1).get(1) - map.get(c2).get(1);
            if (comparator != 0) return comparator;
    
            comparator = map.get(c1).get(2) - map.get(c2).get(2);
            if (comparator != 0) return comparator;
    
            return c2.compareTo(c1);
        });
        for (int x = 0; x < teams.length; x++) {
            StringBuilder s = new StringBuilder(teams[x]);
            s.append(" " + map.get(teams[x]).get(0).toString() + " ");
            s.append(map.get(teams[x]).get(1).toString() + " ");
            s.append(map.get(teams[x]).get(2).toString());
            teams[x] = s.toString();
        }
        return teams;
    }
}
