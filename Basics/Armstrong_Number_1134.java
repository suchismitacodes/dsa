class Solution {
    public boolean isArmstrong(int n) {
        if(n == 0)
            return true;
        int count = 0;
        for(int x = n; x != 0; x /= 10)
            count ++;
        int sum = 0;
        for(int x = n; x != 0; x /= 10) {
            int d = x % 10;
            sum += (int)(Math.pow(d, count));
        }
        return (sum == n);
    }
}
// O(d), d = number of digits in n
