package io.ronanlx.brainteasers;

/**
 * 黑板异或游戏
 * @author Ronan
 */
public class BlackboardXORGame {
    public static void main(String[] args) {
        // 调用方法
        System.out.println(new BlackboardXORGame().xorGame(new int[]{1, 1, 2,}));
        System.out.println(new BlackboardXORGame().xorGame(new int[]{0, 1}));
        System.out.println(new BlackboardXORGame().xorGame(new int[]{1, 2, 3}));
    }

    // 计算方法
    public boolean xorGame(int[] nums) {
        int xorSum = 0;
        for (int num : nums) {
            // 计算总异或值
            xorSum ^= num;
        }
        // 初始异或为0或数组长度为偶数时Alice胜
        return xorSum == 0 || nums.length % 2 == 0;
    }
}
