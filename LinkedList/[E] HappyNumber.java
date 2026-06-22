class Solution {
    public boolean isHappy(int num) {
        int first = num;
        int second = num;
        do {
            second = square(second);
            first = square(square(first));
            if(second == 1 || first == 1) return true;
        }while(first != second);
        return false;
    }
    int square(int digit) {
        int ans = 0;
         while(digit > 0) {
            int rem = digit % 10;
            ans += rem * rem;
            digit = digit / 10;
         }
         return ans;
    }
}