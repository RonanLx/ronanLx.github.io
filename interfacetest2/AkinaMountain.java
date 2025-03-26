package io.ronanlx.interfacetest2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 秋名山车神大赛
 * @author Ronan
 */
public class AkinaMountain {
    public static void main(String[] args) {
        // 初始化比赛元素
        ITrack akagi = new AkagiTrack();
        IRaceRule rule = new BasicRaceRule();

        Map<IDriver, Integer> results = new HashMap<>();

        System.out.println(akagi.getTrackName());

        // 创建参赛组合
        AtomicInteger totalTime = new AtomicInteger(0);
        raceCompetition(new DejimaTakumi(), new ToyotaAE86(), akagi, results, totalTime);
        raceCompetition(new TakahashiKeisuke(), new MazdaRX7(), akagi, results, totalTime);

        // 判定胜负
        rule.determineWinner(results);

        // 输出总时间（可选）
        System.out.println("总比赛时间：" + totalTime.get() + " 秒");
    }

    static void raceCompetition(IDriver driver, ICar car, ITrack track, Map<IDriver, Integer> results, AtomicInteger totalTime) {
        System.out.printf("🚦 %s 驾驶 %s 开始上山%n", driver.getDriverName(), car.getModelName());

        int lapDistance = 5000;
        int distance = 0;
        int maxSpeed = 0;
        int elapsedTime = 0;

        while (distance < lapDistance) {
            // 应用赛道效果
            track.applyTrackEffect(car);
            // 驾驶
            driver.drivingStrategy(car);

            // 计算每秒行进距离
            int speedPerSecond = car.getCurrentSpeed() * 1000 / 3600;
            distance += speedPerSecond;
            elapsedTime++;  // 累计用时（秒）
            // 更新最高时速
            maxSpeed = Math.max(maxSpeed, car.getCurrentSpeed());
        }

        // 输出单次比赛数据
        System.out.printf("🏁 %s 完成比赛！用时：%d秒 | 最高时速：%dkm/h%n", driver.getDriverName(), elapsedTime, maxSpeed);
        results.put(driver, elapsedTime);
        // 将单次比赛时间累加到 totalTime
        totalTime.addAndGet(elapsedTime);
    }
}
