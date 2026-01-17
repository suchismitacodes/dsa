class Solution {
    public int[] divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n; i ++) { // runs √n times
            if(n % i == 0) {
                list.add(i);
              // Divisors always occur in pairs, except the square root of the number.
                if(i != n / i)
                    list.add(n / i);
            }
        }
        Collections.sort(list);
        int[] arr = new int [list.size()];
        for(int i = 0; i < list.size(); i ++)
            arr[i] = list.get(i);
        return arr;
    }
}
// O(√n + klogk), n = number, k = number of divisors
