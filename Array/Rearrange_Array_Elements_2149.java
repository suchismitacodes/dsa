class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int posIndex = 0, negIndex = 0;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0, q = 0;
        for (int num : nums) {
            if (num > 0) pos[p++] = num;
            else neg[q++] = num;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) res[i] = pos[posIndex++];
            else res[i] = neg[negIndex++];
        }
        return res;
    }
}

// Two-pointer took O(n^2) and gave TLE, this gives O(n)
