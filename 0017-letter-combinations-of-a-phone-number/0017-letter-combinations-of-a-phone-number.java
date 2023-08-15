class Solution {
       List<String> ans;
    String[] dial = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
     
    
    
         ans = new ArrayList<>();
        
        if (digits.isEmpty()) {
            return ans;
        }
        
        backtrack("", digits, 0);
        
        return ans;
    }
    
    private void backtrack(String combination, String digits, int index) {
        if (index == digits.length()) {
            ans.add(combination);
            return;
        }
        
        String letters = dial[digits.charAt(index) - '0'];
        
        for (char letter : letters.toCharArray()) {
            backtrack(combination + letter, digits, index + 1);
        }
    }

    
}