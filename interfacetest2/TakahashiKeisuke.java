package io.ronanlx.interfacetest2;

/**
 * 车手高桥启介实现类
 * @author Ronan
 */
public class TakahashiKeisuke implements IDriver{
    private enum DrivingStatus {
        NORMAL, EXIT
    }
    private DrivingStatus status = DrivingStatus.NORMAL;
    @Override
    public void drivingStrategy(ICar car) {
        switch(status) {
            case NORMAL:
                car.accelerate();
                if (car.getCurrentSpeed() > 200) {
                    System.out.println("前方急弯！！！高桥启介还能否保持领先！胜负应该就在这个弯道决定了！");
                    System.out.println("RX7选择了更稳妥的减速过弯，本来直线优势的高桥启介因为弯道棋差一招啊！");
                    status = DrivingStatus.EXIT;
                }
                break;
            case EXIT:
                car.accelerate();
                if (car.getCurrentSpeed() < 180) {
                    System.out.println("RX7过晚恢复加速！");
                    int speed = 10;
                    status = DrivingStatus.NORMAL;
                }
                break;

        }
    }

    @Override
    public String getDriverName() {
        return "高桥启介";
    }
}
