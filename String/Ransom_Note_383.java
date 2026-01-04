class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) // checks if there are extra characters in ransomNote from magazine
            return false;
        int alpha [] = new int[26]; // for storing frquency of each character from a to z, initially 0
        for(char c : magazine.toCharArray())
            alpha[c - 'a'] ++ ; // freq of each char in magazine ++
        for(char c : ransomNote.toCharArray()) {
            if(alpha[c - 'a'] == 0) // if there is any unknown character in ransomNote which is not in magazine
                return false;
            alpha[c - 'a'] -- ; // decrements so that a particular character's freq in ransomNote does not exceed that of in magazine
        }
        return true;
    }
}

// O(n+m), n = length of magazine, m = length of ransomNote
