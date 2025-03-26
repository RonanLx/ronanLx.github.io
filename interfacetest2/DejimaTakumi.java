package io.ronanlx.interfacetest2;

/**
 * 车手藤原拓海实现类
 * @author Ronan
 */
// 驾驶策略状态化
public class DejimaTakumi implements IDriver {
    // 漂移状态
    private enum DriftState {
        NORMAL, DRIFTING, EXIT
    }

    //
    private DriftState state = DriftState.NORMAL;

    @Override
    public void drivingStrategy(ICar car) {
        switch (state) {
            case NORMAL:
                car.accelerate();
                if (car.getCurrentSpeed() >= 200) {
                    System.out.println("前方急弯！！！高桥启介还能否保持领先！胜负应该就在这个弯道决定了！");
                    System.out.println("快看，是排水渠过弯！！！AE86在弯道超过了RX7！");
                    state = DriftState.DRIFTING;
                }
                break;
            case DRIFTING:
                car.brake(50);
                state = DriftState.EXIT;
                break;
            case EXIT:
                car.accelerate();
                if (car.getCurrentSpeed() < 180) {
                    // 出弯爆发性加速
                    int speed = 20;
                    state = DriftState.NORMAL;
                }
                break;
        }
    }

    @Override
    public String getDriverName() {
        return "藤原拓海";
    }
}



