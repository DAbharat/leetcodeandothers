class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(start<end) {
                if((nums[start]+nums[end]+nums[i])==0) {
                List<Integer> triplet = Arrays.asList(nums[i],nums[start],nums[end]);
                ans.add(triplet);
                start++;
                end--;
                while (start < end && nums[start] == nums[start - 1]) start++;
                while (start < end && nums[end] == nums[end + 1]) end--;
            } else if((nums[start]+nums[end])+nums[i]<0) {
                start++;
            } else end--;
            }
        }
        return ans;
    }
}