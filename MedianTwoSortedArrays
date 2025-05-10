# Problem: https://leetcode.com/problems/median-of-two-sorted-arrays/
# Date: 2025-04-30

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int k = 0;
        for (int element : nums1) {
            merged[k++] = element;
        }
        for (int element : nums2) {
            merged[k++] = element;
        }

        Arrays.sort(merged);

        double med = 0;
        if(merged.length%2==0){
            med = ((double) merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2;
        }else {
            med = merged[merged.length / 2];
        }
        return med;
    }
}
