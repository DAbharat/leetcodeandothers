
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            int currentElement = target - nums[i];
            if(map.containsKey(currentElement)) {
                return new int[]{i, map.get(currentElement)};
            }
            map.put(num,i);
        }
        return new int[]{}; 
    }
}



