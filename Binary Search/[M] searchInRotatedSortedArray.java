class Solution {
    public int search(int[] nums, int target) {
        int max = maxElem(nums);
        int start  = 0;
        int end = nums.length-1;

        if(max==-1) {
            return bs(nums, 0, nums.length-1, target);
        } 
        if(nums[max]==target) {
            return max;
        } 
        if(nums[start]>target) {
            return bs(nums, max+1, nums.length-1, target);
        }
        return bs(nums, 0, max-1, target);
        
    }

    int maxElem(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while(start<=end) {
                int mid = start + (end-start) / 2;
                if(mid<end && arr[mid]>arr[mid+1]) return mid;
                if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
                if(arr[mid]<=arr[start]) end=mid-1;
                else start=mid+1;
            }
        return -1;
    }

    int bs(int[] arr, int start, int end, int target) {
        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}