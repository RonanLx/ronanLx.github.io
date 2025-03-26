package io.ronanlx.interfacetest2;

/**
 * 赛道接口
 * @author Ronan
 */
public interface ITrack {
    // 赛道特性影响赛车
    void applyTrackEffect(ICar car);
    String getTrackName();

}
