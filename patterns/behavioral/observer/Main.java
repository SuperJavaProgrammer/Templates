package behavioral.observer;

//создает механизм подписки, позволяющий одним объектам следить и реагировать на события, происходяшие в других объектах
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MeteoStation ms = new MeteoStation();
        ms.addObserver(new ConsoleObserver());
        ms.addObserver(new FileObserver());
        for (int i = 0; i < 10; i++) {
            ms.setNewWeather(25 + (int) (Math.random() * 10), 750 + (int) (Math.random() * 30));
            Thread.sleep(2500);
        }
    }
}
