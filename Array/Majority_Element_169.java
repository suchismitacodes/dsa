class Solution {
    public int majorityElement(int[] nums) {
        int count=0, candidate=0;
        for(int i: nums) {
            if(count == 0)
                candidate=i;
            count += (i == candidate)?1:-1;
        }
        return candidate; // appears more than n/2 times
    }
}

// Boyer-Moore Voting Algorithm
