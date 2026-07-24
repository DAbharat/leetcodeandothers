class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int nse = 0;
        int pse = 0;
        for(int i=0; i<heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]) {
                int val = stack.pop();
                nse = i;
                pse = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max(maxArea, heights[val]*(nse-pse-1));
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int val = stack.pop();
            nse = heights.length;
            pse = stack.isEmpty() ? -1 : stack.peek();
            maxArea = Math.max(maxArea, heights[val]*(nse-pse-1));
        }
        return maxArea;
    }
}