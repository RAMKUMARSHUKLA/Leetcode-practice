class Solution {
    public List<Integer> findAnagrams(String s, String p) {
   
         List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }

        int[] target = new int[26];
        for (char c : p.toCharArray()) {
            target[c - 'a']++;
        }

        int[] window = new int[26];
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                window[s.charAt(i - p.length()) - 'a']--;
            }
            if (isAnagram(target, window)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    private static boolean isAnagram(int[] target, int[] window) {
        for (int i = 0; i < 26; i++) {
            if (target[i] != window[i]) {
                return false;
            }
        }
        return true;
    }
}