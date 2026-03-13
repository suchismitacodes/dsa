class Solution {
    public int[] maxSubArrayWithElements(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;
        for(int i = 1; i < nums.length; i++) {
            if(currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, start, end + 1);
    }
