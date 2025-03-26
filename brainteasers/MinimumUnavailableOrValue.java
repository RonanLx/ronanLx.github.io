package io.ronanlx.brainteasers;

/**
 * 最小无法得到的或值
 * @author Ronan
 */
public class MinimumUnavailableOrValue {
    public static void main(String[] args) {
        // 调用方法
        System.out.println(new MinimumUnavailableOrValue().minImpossible(new int[]{2, 1}));
        System.out.println(new MinimumUnavailableOrValue().minImpossible(new int[]{5, 3, 2}));
    }

    // 计算方法
    public int minImpossible(int[] nums) {
        int maxK = 0, maxOr = 0;
        for (int num : nums) {
            // 判断是否是2的幂次
            if ((num & (num-1)) == 0) {
                // 位掩码记录存在的2的幂
                maxK |= num;
            }
            // 同时计算最大或值
            maxOr |= num;
        }
        int target = 1;
        while (true) {
            // 找到第一个缺失的幂
            if ((maxK & target) == 0) {
                return target;
            }
            // 提前终止条件
            if (target > maxOr) {
                return maxOr + 1;
            }
            target <<= 1;
        }
    }
}
