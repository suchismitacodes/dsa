class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        int result=Integer.MAX_VALUE, max=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            if(freq>max) {
                max=freq;
                result=element;
            }
            else if(freq==max && element<result)
                result=element;
        }
        return result;
    }
}
