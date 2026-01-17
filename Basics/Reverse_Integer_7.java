class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        int rev = 0;
        for(int c = x; c != 0; c /= 10) {
            int d = c % 10;
          // if multiplying the next digit will exceed MAX VALUE or, current rev is the MAX_VALUE except last digit and the last digit is greater than 7, which will exceed the limit of 2147483647
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7))
                return 0;
          // if multiplying the next digit will subceed MIN VALUE or, current rev is the MIN_VALUE except last digit and the last digit is smaller than 8, which will subceed the limit of -2147483648  
          if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8))
                return 0;
            rev = rev * 10 + d;
        }
        return rev;
    }
}
