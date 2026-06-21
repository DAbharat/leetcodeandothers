class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length() != t.length()) return false;

        for(int i=0; i<=s.length()-1; i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int j=0; j<=arr.length-1; j++) {
            if(arr[j]!=0) return false;
        }
        return true;
    }
}