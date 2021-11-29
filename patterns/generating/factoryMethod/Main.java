package generating.factoryMethod;

//Фабричный метод - определяет общий интерфейс для создания разных типов объектов
public class Main {
    public static void main(String[] args) {
        WatchMaker watchMaker = new DigitalWatchMaker();
        Watch watch = watchMaker.createWatch();
        watch.showTime();
        watchMaker = new RomeWatchMaker();
        watch = watchMaker.createWatch();
        watch.showTime();

        watchMaker = WatchMaker.getMakerByName("Digital");
        watch = watchMaker.createWatch();
        watch.showTime();
        watchMaker = WatchMaker.getMakerByName("Rome");
        watch = watchMaker.createWatch();
        watch.showTime();
        watchMaker = WatchMaker.getMakerByName("Space");
        watch = watchMaker.createWatch();
        watch.showTime();
    }

}
