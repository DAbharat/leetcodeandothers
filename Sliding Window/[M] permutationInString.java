class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        int start = 0;
        int end = 0;
        int winSize = charArr1.length;

        for(char ch : charArr1) map.put(ch, map.getOrDefault(ch, 0) + 1);
        
        while(end<charArr2.length) {
            map2.put(charArr2[end], map2.getOrDefault(charArr2[end], 0) + 1);
            if(end-start+1>winSize) {
                map2.put(charArr2[start], map2.get(charArr2[start])-1);
                if(map2.get(charArr2[start])==0) map2.remove(charArr2[start]);
                start++;
            } else if(end-start+1==winSize) {
                if(map.equals(map2)) return true;
            }
            if(map.equals(map2)) return true;
            end++;
        }
        return false;
    }
}