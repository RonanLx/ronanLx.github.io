package io.ronanlx.interfacetest2;

/**
 * 赛车马自达RX7实现类
 * @author Ronan
 */
public class MazdaRX7 implements ICar{
    // 初始化速度
    private int speed = 0;
    // 最大速度
    private final int MAX_SPEED = 220;

    @Override
    public void accelerate() {
        int reduction = (getCurrentSpeed() > 200) ? 15 : 25;
        // 保持原最大速度
        speed = Math.min(speed + reduction, 220);
    }

    @Override
    public void brake(int i) {
        speed = Math.max(speed - 30, 0);
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }

    @Override
    public String getModelName() {
        return "🏎️ MazdaRX7";
    }
}
