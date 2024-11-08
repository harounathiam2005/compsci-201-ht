public class TxMsg {

    public String getMessage(String original) {
      
        String[] words = original.split(" ");
        for (int i = 0; i < words.length; i++) {
            String r = changeIt(words[i]);
            words[i] = r;
        }
        String ret = "";
        for (String s : words) {
            ret += s + " ";
        }
        return ret.trim();

    }

    private boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) >= 0;
    }

    private String changeIt(String s) {

        if (allVowels(s)) {
            return s;
        }

        String ret = "";
        if (!isVowel(s.charAt(0))) {
            ret += s.charAt(0);
        }
        for (int i = 1; i < s.length(); i++) {
            char before = s.charAt(i-1);
            char ch = s.charAt(i);
            if (!isVowel(ch) && isVowel(before)) {
                ret += ch;
            }
        }
        return ret;

    }

    private boolean allVowels(String s) {
        for (char ch : s.toCharArray()) {
            if (!isVowel(ch)) {
                return false;
            }
        }
        return true;
    }

 }