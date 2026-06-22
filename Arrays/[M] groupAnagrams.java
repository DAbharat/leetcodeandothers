class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedChar = new String(ch);

            if(!map.containsKey(sortedChar)) {
                map.put(sortedChar, new ArrayList<>());
            }
            map.get(sortedChar).add(str);
        }
        return new ArrayList<>(map.values());
    }
}