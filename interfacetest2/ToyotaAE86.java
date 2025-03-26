package io.ronanlx.interfacetest2;

/**
 * 赛车丰田AE86实现类
 * @author Ronan
 */
public class ToyotaAE86 implements ICar {
    // 初始化速度
    private int speed = 0;
    // 最大速度
    private final int MAX_SPEED = 220;

    @Override
    public void accelerate() {
        // 低速段加速更快
        int baseAccel = (getCurrentSpeed() < 180) ? 40 : 25;
        // 最大速度提升
        speed = Math.min(speed + baseAccel, 230);
    }



    @Override
    public void brake(int i) {
        // 减速
        speed = Math.max(speed - 30, 0);
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }

    @Override
    public String getModelName() {
        return "🏎️ Toyota AE86";
    }
}
