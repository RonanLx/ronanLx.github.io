package io.ronanlx.interfacetest2;

/**
 * 驾驶员接口
 * @author Ronan
 */
public interface IDriver {
    // 传入接口类型
    void drivingStrategy(ICar car);
    String getDriverName();
}
