class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        int[] arr = new int[n];

        int i = 0, j = 0, k = 0;

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] < nums2[j]) {
                if(k == 0 || arr[k-1] != nums1[i])
                    arr[k++] = nums1[i];
                i++;
            }

            else if(nums2[j] < nums1[i]) {
                if(k == 0 || arr[k-1] != nums2[j])
                    arr[k++] = nums2[j];
                j++;
            }

            else {
                if(k == 0 || arr[k-1] != nums1[i])
                    arr[k++] = nums1[i];
                i++;
                j++;
            }
        }

        while(i < nums1.length) {
            if(k == 0 || arr[k-1] != nums1[i])
                arr[k++] = nums1[i];
            i++;
        }

        while(j < nums2.length) {
            if(k == 0 || arr[k-1] != nums2[j])
                arr[k++] = nums2[j];
            j++;
        }

        int[] res = new int[k];
        for(int x = 0; x < k; x++)
            res[x] = arr[x];

        return res;
    }
}

// Merge Step of Merge Sort with duplicate removal
