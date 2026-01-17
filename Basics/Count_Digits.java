class Solution {
    public int countDigit(int n) {
      if(n == 0)
        return 0;
      int count = 0;
        for(int c = n; c != 0; c /= 10)
            count ++;
        return count;
    }
}
// O(d), d = number of digits
