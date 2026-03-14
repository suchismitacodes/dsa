class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> ST = new HashMap<>();
        HashMap<Character, Character> TS = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(ST.containsKey(c) && ST.get(c)!=d)
                return false;
            if(TS.containsKey(d) && TS.get(d)!=c)
                return false;
            ST.put(c,d);
            TS.put(d,c);  
        }
        return true;
    }
}
