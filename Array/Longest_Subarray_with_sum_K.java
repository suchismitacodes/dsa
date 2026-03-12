class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0, max=0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i]; // Prefix Sum
            if(sum == k)
                max=i+1;
            if(map.containsKey(sum-k)) {
                int l = i - map.get(sum-k);
                max=Math.max(max, l);
            }
            if(!map.containsKey(sum))
                map.put(sum, i); // <Cumulative Sum, Starting Index of subarray>          
        }
        return max;
    }
}
