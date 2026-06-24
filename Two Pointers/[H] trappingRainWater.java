class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int waterCap = 0;
        while(start<end) {
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);
            if(leftMax<rightMax) {
                waterCap += leftMax - height[start];
                start++;
            } else {
                waterCap += rightMax - height[end];
                end--;
            }
        }
        return waterCap;
    }
}