class Solution {
    private void swap(int nums[], int a, int b) {
        int c=nums[a];
        nums[a]=nums[b];
        nums[b]=c;
    }
    private void reverse(int nums[], int i, int j) {
        while(i<j)
            swap(nums, i++, j--);
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2; // pivot, starting from second-last element
        // Find pivot
        while(i>=0 && nums[i] >= nums[i+1])
            i--;
        // Find the smallest element right to pivot which is greater than pivot, to be swapped
        if(i>=0) { // If pivot is found, or else i will be -1
            int j=n-1; // successor
            while(nums[j] <= nums[i]) // since suffix is already in descending
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1); // reverse the suffix or the whole array
    }
}
