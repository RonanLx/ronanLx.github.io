package io.ronanlx.interfacetest2;

/**
 * 秋名山赛道实现类
 * @author Ronan
 */
public class AkagiTrack implements ITrack {
    @Override
    public void applyTrackEffect(ICar car) {
        if (car.getCurrentSpeed() >= 200) {
            // AE86刹车衰减更小
            car.brake(car instanceof ToyotaAE86 ? 20 : 50);
        }
    }

    @Override
    public String getTrackName() {
        return "🏔️ 秋名山赛道";
    }
}
