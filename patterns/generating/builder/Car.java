package generating.builder;

public class Car {
    String mark;
    String transmission;
    int speed;

    public void setMark(String mark) {
        this.mark = mark;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission='" + transmission + '\'' +
                ", speed=" + speed +
                '}';
    }
}
