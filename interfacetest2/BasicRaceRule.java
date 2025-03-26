package io.ronanlx.interfacetest2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/**
 * 比赛规则实现类
 * @author Ronan
 */
public class BasicRaceRule implements IRaceRule {
    @Override
    public void determineWinner(Map<IDriver, Integer> results) {
        IDriver winner = Collections.min(results.entrySet(),
                Comparator.comparingInt(Map.Entry::getValue)).getKey();

        System.out.println("\n🏆 冠军：" + winner.getDriverName());
    }
}
