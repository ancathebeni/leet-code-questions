class Solution {
    public String firstPalindrome(String[] words) {

        for (String word : words) {

            boolean palindrome = true;

            int left = 0;
            int right = word.length() - 1;

            while (left < right) {

                if (word.charAt(left) != word.charAt(right)) {
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (palindrome) {
                return word;
            }
        }

        return "";
    }
}
