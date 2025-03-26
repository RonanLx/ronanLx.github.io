package io.ronanlx.brainteasers;

/**
 * 所有数对的异或和
 * @author Ronan
 */
public class XORAll {
    public static void main(String[] args) {
        // 调用方法
        System.out.println(new XORAll().xorAllNums(new int[]{2, 1, 3}, new int[]{10, 2, 5, 0}));
        System.out.println(new XORAll().xorAllNums(new int[]{1, 2}, new int[]{3, 4}));
    }

    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;
        // 计算nums1的异或总和
        for (int num : nums1) {
            xor1 ^= num;
        }
        // 计算nums2的异或总和
        for (int num : nums2) {
            xor2 ^= num;
        }

        // 判断nums1长度的奇偶性
        int m = nums1.length % 2;
        // 判断nums2长度的奇偶性
        int n = nums2.length % 2;

        int res = 0;
        // nums2长度奇数则保留nums1的总异或
        if (n == 1) {
            res ^= xor1;
        }
        // nums1长度奇数则保留nums2的总异或
        if (m == 1) {
            res ^= xor2;
        }
        return res;
    }
}
