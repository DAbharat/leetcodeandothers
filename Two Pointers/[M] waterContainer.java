class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        int currArea;
        while(start<end) {
            currArea = (end-start)*Math.min(height[start],height[end]);
            if(currArea>maxArea) maxArea=currArea;
            if(height[start]<height[end]) {
                start++;
            } else end--;
        }
        return maxArea;
    }
}