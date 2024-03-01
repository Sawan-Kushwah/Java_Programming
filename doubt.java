class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[n + m];
        int i, j, k;
        i = j = k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                k++;
                i++;
            } else {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            result[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            result[k] = nums2[j];
            k++;
            j++;
        }
        int sum = 0;
        for (  k = 0; k < m + n; k++) {
            System.out.println(result[k]);
        }
        for (  k = 0; k < m + n; k++) {
            sum += result[k];
        }
        double median = (double) sum / (m + n);
        return median;
    }

    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2,7};
        System.out.print(findMedianSortedArrays(a, b));

    }
}