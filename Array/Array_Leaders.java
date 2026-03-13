class Solution {
    public List<Integer> leaders(int[] nums) {
        int n=nums.length;
        List<Integer> leaders = new ArrayList<>(); // elements which are strictly greater all its elements in the right
        int max=Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--) {
            if(nums[i] > max) {
                max=nums[i];
                leaders.add(nums[i]);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
