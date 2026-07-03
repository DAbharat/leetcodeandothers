class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        char[] charArr = s.toCharArray();
        int start = 0;
        int end = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for(char ch : t.toCharArray()) map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        int mapSize = map1.size();

        while(end<charArr.length) {
            if(map1.containsKey(charArr[end])) {
                map1.put(charArr[end], map1.get(charArr[end])-1);
                if(map1.get(charArr[end])==0) {
                    mapSize--;
                }
            }
            while(mapSize==0) {
                if (end-start+1<minLen) {
                    minLen=end-start+1;
                    minStart=start;
                }
                if(map1.containsKey(charArr[start])) {
                    map1.put(charArr[start], map1.get(charArr[start])+1);
                    if(map1.get(charArr[start])>0) {
                        mapSize++;
                    }
                }
                start++;
            }
            end++;
        }
        if (minLen == Integer.MAX_VALUE) return "";
        return s.substring(minStart, minStart+minLen);
    }
}