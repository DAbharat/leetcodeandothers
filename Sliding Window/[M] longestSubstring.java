//without repeating characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(end<charArr.length) {
            while(map.containsKey(charArr[end])) {
                map.remove(charArr[start]);
                start++;
            }
            map.put(charArr[end], map.getOrDefault(charArr[end],0) + 1);
            maxLength = Math.max(maxLength, end-start+1);
            end++;
        }
        return maxLength;
    }
}