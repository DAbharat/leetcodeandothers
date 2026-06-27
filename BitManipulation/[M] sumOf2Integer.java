class Solution {
    public int getSum(int a, int b) {
        while(b!=0) {
            int res = a^b;
            int car = a&b;
            car = car<<1;
            a=res;
            b=car;
        }
        return a;
    }
}