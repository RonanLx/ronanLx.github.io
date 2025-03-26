package io.ronanlx.interfacetest2;

/**
 * 赛车接口
 * @author Ronan
 */
public interface ICar {
    // 加速
    void accelerate();
    // 刹车
    void brake(int i);
    // 当前速度
    int getCurrentSpeed();
    // 车型名称
    String getModelName();
}
