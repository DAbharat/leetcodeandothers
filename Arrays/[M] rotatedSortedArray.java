
class Solution {
    public int search(int[] nums, int target) {
        int pivot = searchInRSA(nums);
        if(pivot == -1) {
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target) {
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    int binarySearch(int[] arr, int target,int start, int end) {

        //default bs (start=0; end==arr.length-1) waali condn nahi lagani, kyunki woh hum khud pass karenge doosre func se



        while(start <= end) {
            int middleElem = (start + end)/2;
            if (target<arr[middleElem]) {
                end = middleElem-1;
            }
            else if (target>arr[middleElem]) {
                start = middleElem+1;
            }
            else {
                return middleElem;
            }
        }
        return -1;
    }

    int searchInRSA(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end) {
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]<=arr[start]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
