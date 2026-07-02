class Solution {
    public int characterReplacement(String s, int k) {
        char[] charArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int maxFreq = 0;
        while(end<charArr.length) {
            map.put(charArr[end], map.getOrDefault(charArr[end], 0) + 1);
            maxFreq=Math.max(maxFreq,map.get(charArr[end]));
            if(((end-start)-maxFreq+1)>k) {
                map.put(charArr[start], map.get(charArr[start]) - 1);
                start++;
            }
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}