class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        
        return ans;
    }

    int search(int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middleElem = (start + end) / 2;
            if (start > end) {
                return -1;
            } else if (target < nums[middleElem]) {
                end = middleElem - 1;
            } else if (target > nums[middleElem]) {
                start = middleElem + 1;
            } else {
                ans = middleElem;
                if(firstStartIndex) {
                    end = middleElem-1;
                }
                else {
                    start = middleElem+1;
                }
            }
        }
        return ans;
    }
}