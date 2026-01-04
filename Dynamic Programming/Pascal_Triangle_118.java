class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for(int i = 0; i < numRows; i ++) {
            List<Integer> r = new ArrayList<>(); // take each row
            for(int j = 0; j <= i; j ++) {
                if(j == 0 || j == i) // edge numbers
                    r.add(1);
                else {
                    int val = tri.get(i-1).get(j-1) + tri.get(i-1).get(j); // middle numbers calculated from previous results
                    r.add(val); // add number to row
                }
            }
            tri.add(r); // add row to triangle
        }
        return(tri);
    }
}
