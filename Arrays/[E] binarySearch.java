class Solution {
    public int search(int[] nums, int target) {
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
                return middleElem;
            }
        }
        return -1;

    }
}
