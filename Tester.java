import java.util.ArrayList;
import java.util.HashMap;

public class Tester {
    public static void main(String[] args) {
        String a = "horse";
        String b = "seems";
        HashMap<String, Integer> mapA = new HashMap<String, Integer>(0);
        HashMap<String, Integer> mapB = new HashMap<String, Integer>(0);
        ArrayList<String> returnChars = new ArrayList<String>(0);
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (mapA.keySet().contains(b.substring(i,i+1))) {
                mapA.replace(b.substring(i,i+1), mapA.get(b.substring(i,i+1))+1);
            }
            else {
                mapA.put(b.substring(i,i+1),1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (mapB.keySet().contains(a.substring(i,i+1))) {
                mapB.replace(a.substring(i,i+1), mapB.get(a.substring(i,i+1))+1);
            }
            else {
                mapB.put(a.substring(i,i+1),1);
            }
        }
        for (String i : mapA.keySet()) {
            System.out.println(i + ", " + mapA.get(i));
        }
        System.out.println("----");
        for (String i : mapB.keySet()) {
            System.out.println(i + ", " + mapB.get(i));
        }
        for (String c : mapA.keySet()) {
            for (String c2 : mapB.keySet()) {
                if (c.equals(c2)) {
                    for (int i = 0; i < Integer.min(mapA.get(c),mapB.get(c2)); i++) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    }

/*
 * 
        // get index(es) of value(s) in array with the max value
        ArrayList<Integer> largestNumChars = new ArrayList<Integer>(0);
        for (int n = 0; n < letters.length; n++) {
            if (max == letters[n]) {
                largestNumChars.add(n);
            }
        }
        // 
        int max2 = Integer.MIN_VALUE;
        for (int i : largestNumChars) {
            if (lengths[i] > max2) {
                max2 = lengths[i];
            }
        }
        System.out.println(max2);
        System.out.println(lengths.indexOf(max2));
        for (int l : largestNumChars) {
            System.out.println(l);
        }
        return strands[largestNumChars.get(largestNumChars.indexOf(max2))];
 */