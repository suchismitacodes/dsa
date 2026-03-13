class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0, max=nums[0];
        for(int n: nums) {
            curr = Math.max(n, curr+n); // the running window storing possibility of a greater sum
            max = Math.max(max, curr); // stores the highest sum encountered
        }
        return max;
    }
}

// Kadane's Algorithm
