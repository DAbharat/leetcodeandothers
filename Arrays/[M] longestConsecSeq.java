class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int currSeq=1;
        int longSeq=1;
        for(int i=0; i<nums.length-1; i++) {
            if((nums[i+1]-nums[i] == 1)) {
                currSeq++;
            } else if(nums[i] == nums[i+1]){
                continue;
            } else {
                longSeq=Math.max(longSeq, currSeq);
                currSeq=1;
            }
        }
        return Math.max(longSeq, currSeq);
    }
}