class Solution {
    public void reverse(int[] arr, int n) {
        recursion(arr, 0, n);
    }
    private void recursion(int arr[], int i, int n) {
        if(i>=n/2)
            return;
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
        recursion(arr, i+1, n);
    }
}
