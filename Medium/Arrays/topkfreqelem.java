class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=nums.length-1; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            list.add(entry);
        }
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int[] ans = new int[k];
        for(int i=0; i<k; i++) ans[i] = list.get(i).getKey();
        return ans;
    }
}