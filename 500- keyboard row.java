import java.util.*;

class Solution {
    public String[] findWords(String[] words) {

        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();

        for (char c : "qwertyuiop".toCharArray())
            row1.add(c);

        for (char c : "asdfghjkl".toCharArray())
            row2.add(c);

        for (char c : "zxcvbnm".toCharArray())
            row3.add(c);

        ArrayList<String> ans = new ArrayList<>();

        for (String word : words) {

            String s = word.toLowerCase();

            HashSet<Character> row;

            if (row1.contains(s.charAt(0)))
                row = row1;
            else if (row2.contains(s.charAt(0)))
                row = row2;
            else
                row = row3;

            boolean valid = true;

            for (char c : s.toCharArray()) {
                if (!row.contains(c)) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}
