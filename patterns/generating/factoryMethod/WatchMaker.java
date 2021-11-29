package generating.factoryMethod;

public interface WatchMaker {
    Watch createWatch();
    static WatchMaker getMakerByName(String name) {
        if (name.equals("Digital"))
            return new DigitalWatchMaker();
        if (name.equals("Rome"))
            return new RomeWatchMaker();
        throw new RuntimeException("Часов " + name + " еще нет");
    }
}
