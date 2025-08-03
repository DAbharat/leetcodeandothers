class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int middleElem = (start + end)/2;
            if(start>end) {
                System.out.println("Element not found");
            }
            else if (target<letters[middleElem]) {
                end = middleElem-1;
            }
            else {
                start = middleElem+1;
            }
        }
        return letters[start%letters.length];
    }
}