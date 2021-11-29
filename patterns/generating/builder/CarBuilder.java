package generating.builder;

public class CarBuilder {
    String mark;
    String transmission;
    int speed;

    CarBuilder buildMark(String mark) {
        this.mark = mark;
        return this;
    }

    CarBuilder buildTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    Car build() {
        Car car = new Car();
            car.setMark(mark);
            car.setSpeed(speed);
            car.setTransmission(transmission);
        return car;
    }
}
