class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return new ArrayList<>();
        }
        return pn("",digits);
    }
    

    ArrayList<String> pn(String fh, String sh) {
        if(sh.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(fh);
            return list;
        }

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = sh.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (char ch: map[digit].toCharArray()) {
            list.addAll(pn(fh+ch, sh.substring(1)));
        }
        return list;
    }
}

//It was becoming too confusing because I was trying to hardcode the arithmetic logic for letter mappings, but couldn't, as keypads has 4 letters for "7" and "9", and 3 for others
// Mistake: this loop :- for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
//             char ch = (char)('a' + i);
//             list.addAll(pn(fh+ch, sh.substring(1)));
//         }

//Fixed it using a string array to store the mappings of numbers to letters
// String[] map = {
//             "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
//         };