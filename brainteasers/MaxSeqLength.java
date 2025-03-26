package io.ronanlx.brainteasers;

/**
 * 找数组中最大值的最长连续序列的长度
 * @author Ronan
 */
public class MaxSeqLength {
    public static void main(String[] args) {
        MaxSeqLength solution = new MaxSeqLength();
        int[] nums1 = {3, 3, 3};
        System.out.println(solution.longestSubarray(nums1));

        int[] nums2 = {5, 7, 5};
        System.out.println(solution.longestSubarray(nums2));

        int[] nums3 = {1, 2, 3, 4};
        System.out.println(solution.longestSubarray(nums3));
    }
    public int longestSubarray(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        int maxLen = 0, currentLen = 0;
        for (int num : nums) {
            if (num == maxVal) {
                currentLen++;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
            } else {
                currentLen = 0;
            }
        }
        return maxLen;
    }
}

