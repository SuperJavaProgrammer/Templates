package generating.builder;

public class Ford extends CarBuilderAb {
    void buildMark() {
        car.setMark("Ford");
    }
    void buildTransmission() {
        car.setTransmission("auto");
    }
    void buildSpeed() {
        car.setSpeed(200);
    }
}
