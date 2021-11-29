package generating.builder;

//Строитель - позволяет создавать сложные объекты пошагово, дает возможность использовать один и тот же код строительства для получения разных представлений объектов
public class Main {
    public static void main(String[] args) {
        Car ferrari = new CarBuilder()
                .buildMark("ferrari")
                .buildSpeed(300)
                .buildTransmission("auto")
                .build();
        System.out.println(ferrari);
        Car niva = new CarBuilder()
                .buildMark("niva")
                .buildSpeed(120)
                .buildTransmission("no")
                .build();
        System.out.println(niva);

        Director director = new Director();
        director.setCarBuilderAb(new Subaru());
        Car car = director.build();
        System.out.println(car);
        director.setCarBuilderAb(new Ford());
        car = director.build();
        System.out.println(car);
    }
}
