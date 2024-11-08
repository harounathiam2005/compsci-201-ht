import java.util.*;

public class Aaagmnrs {

    public String[] anagrams(String[] phrases) {
/* 
        


        
        return new String[0];
*/
        List<Integer> anagram = new ArrayList<>(0);
        List<Integer> secondAnagram = new ArrayList<>(0);

        List<String> ret = new ArrayList<>(0);
        ret.addAll(Arrays.asList(phrases));
        List<Map<String,Integer>> mapArr = new ArrayList<>(0);

        for (int i = 0; i < phrases.length; i++) {

            Map<String,Integer> map = new HashMap<>(0);
            for (int x = 0; x < phrases[i].length(); x++) {
                String current = phrases[i].substring(x,x+1).toLowerCase();
                if (current.equals(" ")) {
                    continue;
                }
                if (!map.containsKey(current)) {
                    map.put(current, 1);
                }
                else {
                    map.replace(current, map.get(current)+1);
                }
            }
            mapArr.add(map);

        }

        for (int k = 0; k < mapArr.size(); k++) {
            for (int j = 0; j < mapArr.size(); j++) {
                if (k == j) {
                    continue;
                }
                if (secondAnagram.contains(k)) {
                    continue;
                }
                if (mapArr.get(k).equals(mapArr.get(j))) {
                    System.out.println("TRUE: " + k + " AND " + j);
                    anagram.add(Math.min(k,j));
                    secondAnagram.add(Math.max(k,j));
                    ret.remove(Math.min(k,j));
                }
            }
        }

        System.out.println(mapArr.toString());
        System.out.println("FIRST");
        for (int i : anagram) {
            System.out.println(i);
        }
        System.out.println("SECOND");
        for (int i : secondAnagram) {
            System.out.println(i);
        }
        
        List<Integer> noDuplicateAna = new ArrayList<Integer>(new HashSet<Integer>(anagram));
        for (int o = 0; o < noDuplicateAna.size(); o++) {
            ret.add(phrases[noDuplicateAna.get(o)]);
        }

        String[] newRet = new String[ret.size()];

        for (int z = 0; z < ret.size(); z++) {
            newRet[z] = ret.get(z);
        }

        for (String i : newRet) {
            System.out.println(i);
        }

        return newRet;
        

    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = b.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (arr1.equals(arr2)) {
                return true;
            }
            return false;
        }
        return false;
    }

 }