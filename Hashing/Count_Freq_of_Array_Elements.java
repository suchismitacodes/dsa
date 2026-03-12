class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;
    }
}
