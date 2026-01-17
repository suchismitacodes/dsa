class Solution {
    public boolean isPalindrome(int x) {
      // If the number is (-)ve, or a multiple of 10  
      if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + (x % 10); // computes the reversed half
            x /= 10; // computes the half not reversed
        }
      // for even digit palindrome numbers, both the halves will be equal
      // for odd digit palindrome numbers, the reversed half except the last digit (which is the middle digit) will be equal to the other half
      return (x == rev || x == rev / 10);
    }
}
