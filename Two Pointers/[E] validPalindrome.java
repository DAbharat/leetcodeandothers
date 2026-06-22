class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        int start = 0;
        int end = s.length() - 1;
        while(start<end) {
            if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                start++;
                end--;
            } else if(!Character.isLetterOrDigit(Character.toLowerCase(s.charAt(start)))) {
                start++;
            } else if(!Character.isLetterOrDigit(Character.toLowerCase(s.charAt(end)))){
                end--;
            } else return false;
        }
        return true;
    }
}