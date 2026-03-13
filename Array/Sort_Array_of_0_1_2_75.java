class Solution {
    private void swap(int nums[], int a, int b) {
        int c=nums[a];
        nums[a]=nums[b];
        nums[b]=c;
    }
    public void sortColors(int[] nums) {
        int low = 0, high=nums.length-1, i=0;
        while(i<=high) {
            if(nums[i] == 0) {
                swap(nums, low, i);
                i++;
                low++;
            }
            else if(nums[i] == 2) {
                swap(nums, high, i);
                high --;
            }
            else // nums[i] == 1
                i++;
        }
    }
}
