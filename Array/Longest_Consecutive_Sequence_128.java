class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int n: nums)
            set.add(n);
        int longest=0;
        for(int num: set) {
            if(!set.contains(num-1)) { // start of a valid sequence
                int curr=num, length=1;
                while(set.contains(curr+1)) {
                    curr++;
                    length++;
                }
                longest=Math.max(longest, length);
            }
        }
        return longest;
    }
}
