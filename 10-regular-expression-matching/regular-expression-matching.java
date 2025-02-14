class Solution {
    public boolean isMatch(String text, String pattern) {
       int i = text.length() - 1;
       int j = pattern.length() - 1;
       return IsMatchRecursion(i, j, text, pattern);
    }

    private boolean IsMatchRecursion(int i, int j, String s, String p) {
        if (i < 0 && j < 0) return true;
        if (j < 0) return false; // If pattern is exhausted but text isn't, return false

        if (i < 0) {
            // Pattern can match empty string only if it consists of pairs of (char, '*')
            if (p.charAt(j) == '*') return IsMatchRecursion(i, j - 2, s, p);
            return false;
        }

        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            return IsMatchRecursion(i - 1, j - 1, s, p);
        }
        
        if (p.charAt(j) == '*') {
            boolean matchZero = IsMatchRecursion(i, j - 2, s, p); // Ignore '*' and preceding character
            boolean matchMore = (s.charAt(i) == p.charAt(j - 1) || p.charAt(j - 1) == '.') 
                                && IsMatchRecursion(i - 1, j, s, p); // Match one or more occurrences
            return matchZero || matchMore;
        }

        return false;
    }
}
