package generating.builder;

abstract class CarBuilderAb {
    Car car;

    void createCar() {
        car = new Car();
    }
    Car getCar() {
        return car;
    }

    abstract void buildMark();
    abstract void buildTransmission();
    abstract void buildSpeed();
}
