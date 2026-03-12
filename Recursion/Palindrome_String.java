class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return helper(s, 0, s.length()-1);
    }
    private boolean helper(String s, int l, int r) {
        if(l>=r)
            return true;
        if(s.charAt(l) != s.charAt(r))
            return false;
        return helper(s, l+1, r-1);
    }
}
