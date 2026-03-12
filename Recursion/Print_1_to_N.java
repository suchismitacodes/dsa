class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        if(n==1) {
            System.out.println(n);
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}
