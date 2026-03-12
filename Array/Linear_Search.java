class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
        int res=-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                res=i;
                break;
            }
        }
        return res;
    }
}
