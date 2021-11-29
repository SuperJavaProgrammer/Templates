package generating.builder;

public class Director {
    CarBuilderAb carBuilderAb;

    void setCarBuilderAb(CarBuilderAb cb) {
        carBuilderAb = cb;
    }

    Car build() {
        carBuilderAb.createCar();
        carBuilderAb.buildMark();
        carBuilderAb.buildSpeed();
        carBuilderAb.buildTransmission();
        return carBuilderAb.getCar();
    }
}
