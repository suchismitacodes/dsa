class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                count++;
            } 
            else {
                result.add(Arrays.asList(nums[i - 1], count));
                count = 1;
            }
        }
        result.add(Arrays.asList(nums[nums.length - 1], count));
        return result;
    }
}
