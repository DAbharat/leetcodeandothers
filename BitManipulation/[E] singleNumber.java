class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i=0; i<nums.length-1; i++) {
            ans = ans^nums[i+1];
        }
        return ans;
    }
}