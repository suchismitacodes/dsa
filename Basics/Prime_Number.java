class Solution {
    public boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for(int i = 2; i * i <= n; i ++) { // runs upto √n times
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
// O(√n), n = number
