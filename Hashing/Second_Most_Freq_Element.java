class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        int result=Integer.MAX_VALUE, max=0, max2=0;
        for(int value: map.values()) {
            if(value>max)
                max=value;
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int freq=entry.getValue();
            int element=entry.getKey();
            if(freq<max && freq>max2) {
                max2=freq;
                result=element;
            }
            else if(freq<max && freq==max2 && element<result)
                result=element;
        }
        return result;
    }
}


