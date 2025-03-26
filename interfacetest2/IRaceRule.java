package io.ronanlx.interfacetest2;

import java.util.Map;

/**
 * 比赛规则接口
 * @author Ronan
 */
public interface IRaceRule {
    void determineWinner(Map<IDriver, Integer> results);
}
