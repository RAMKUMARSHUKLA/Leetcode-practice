class Solution {
    public String convert(String s, int numRows) {
// if (numRows == 1 || numRows >= s.length()) {
//             return s;
//         }

//         StringBuilder[] rows = new StringBuilder[numRows];
//         for (int i = 0; i < numRows; i++) {
//             rows[i] = new StringBuilder();
//         }

//         int direction = 1; // 1 for down, -1 for up
//         int currentRow = 0;

//         for (char c : s.toCharArray()) {
//             rows[currentRow].append(c);

//             if (currentRow == 0) {
//                 direction = 1;
//             } else if (currentRow == numRows - 1) {
//                 direction = -1;
//             }

//             currentRow += direction;
//         }

//         StringBuilder result = new StringBuilder();
//         for (StringBuilder row : rows) {
//             result.append(row);
//         }

//         return result.toString();
        
        int index = 0;
        StringBuilder[] st = new StringBuilder[numRows];
        for (int i = 0; i < st.length; i++) st[i] = new StringBuilder();
        while (index < s.length()) {
            for (int i = 0; i < numRows && index < s.length(); i++) st[i].append(s.charAt(index++));
            for (int i = numRows - 2; i > 0 && index < s.length(); i--) st[i].append(s.charAt(index++));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < st.length; i++) result.append(st[i]);
        return result.toString();
        
    }
}