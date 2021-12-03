package behavioral.state;

//позволяет объектам менять поведение в зависимости от своего состояния. Извне создается впечатление, что изменился класс объекта
public class Main {
    public static void main(String[] args) {
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);
        radio.play();
        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }
    }
}
