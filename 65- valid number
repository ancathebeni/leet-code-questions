class Solution {
    public boolean isNumber(String s) {
        int n = s.length();
        int i = 0;
        
        // Skip leading whitespace (LeetCode usually trims, but just in case)
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;
        
        for (i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '+' || c == '-') {
                // Sign must be at start, or right after 'e'/'E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                // No multiple dots, no dot after exponent
                if (seenDot || seenExponent) return false;
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                // No multiple 'e', must have digit before it
                if (seenExponent || !seenDigit) return false;
                seenExponent = true;
                seenDigit = false; // reset: need digit after exponent
            } else {
                return false; // invalid character
            }
        }
        
        return seenDigit;
    }
}
