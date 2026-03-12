class Solution {
    public int largestElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i: nums) {
            if(i>max) {
                max2=max;
                max=i;
            }
            else if(i>max2 && i<max)
                max2=i;
        }
        return max2;
    }
}
