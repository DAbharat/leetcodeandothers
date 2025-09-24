class Solution {
    public int numberOfSteps(int num) {
        return steps(num);
    }

    int steps(int n) {
        return count(n,0);
    }

    int count(int n, int count) {
        if(n==0) return count;
        if(n%2 == 0) {
            return count(n/2, count+1);
        }
        return count(n-1, count+1);
    }
}