class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp [][] = new int [s1.length() + 1] [s2.length() + 1]; // First row and first column is filled with 0's
        for(int i=0;i<s1.length();i++) { // For indexing the whole length of s1
            for(int j=0;j<s2.length();j++) { // For indexing the whole length of s2
                if(s1.charAt(i) == s2.charAt(j)) // If a character in both string matches
                    dp[i+1][j+1] = dp[i][j] + s1.charAt(i); 
                  // In the DP matrix, the ASCII value of the matched character added with the previous diagonal cell's value is stored in the current cell
                else // If the character doesn't match
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
              // Two values are taken into consideration: 1. Same row, previous column cell ; 2. Previous row, same column cell
              // The maximum of these 2 values is retained as the current cell's value as we want to maximize the subsequence sum
            }
        }
        int sum = 0;
        // Computing the total ASCII value of the 2 strings
        for(char c : s1.toCharArray())
            sum += c;
        for(char c : s2.toCharArray())
            sum += c;
        int del_cost = sum - 2 * dp[s1.length()][s2.length()]; // Subtract the subsequence sum from the total as it appears twice in both strings
        return del_cost; // Higher the subsequence sum, lower the deletion cost
    }
}

// O (m * n), m = length of string 1, n = length of string 2
