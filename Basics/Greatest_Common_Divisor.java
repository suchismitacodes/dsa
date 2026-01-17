// Euclidean Algorithm using iterative approach (recursive also applicable)
class Solution {
    public int GCD(int n1, int n2) {
        int n3;
        while(n2 != 0) {
            n3 = n1 % n2;
            n1 = n2;
            n2 = n3;
        }
        return(Math.abs(n1)); // since GCD is a positive integer by definition
    }
}
