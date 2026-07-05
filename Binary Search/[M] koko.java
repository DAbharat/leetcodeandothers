class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = findMax(piles);
        int minVal = Integer.MAX_VALUE;
        while(start<=end) {
            int totalHrs = 0;
            int mid = start + (end-start) / 2;
            for(int i=0; i<=piles.length-1; i++) {
                totalHrs += Math.ceil((double)piles[i]/mid);
            }
            if(totalHrs<h) {
                end=mid-1;
                minVal = Math.min(minVal,mid);
            } else if(totalHrs>h) {
                start=mid+1;
            } else {
                end=mid-1;
                minVal=Math.min(minVal, mid);
            }
        }
        return minVal;
    }

    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
}