class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==1)
            return true;
        int i=0, j=n-1;
        s=s.toLowerCase();
        while(i<=j) {
            char c=s.charAt(i);
            char d=s.charAt(j);
            if(!Character.isLetterOrDigit(c))
                i++;
            else if(!Character.isLetterOrDigit(d))
                j--;
            else {
                if(c!=d)
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
