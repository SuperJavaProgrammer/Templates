package structural.facade;

//предоставляет протсой(но урезанный) интерфейс к сложной системе классов
public class Main {
    public static void main(String[] args) {
//        Не используя Фасад
//        Power power = new Power();
//        power.on();
//        DVD dvd = new DVD();
//        dvd.load();
//        HDD hdd = new HDD();
//        hdd.copy(dvd);

        Computer computer = new Computer();
        computer.copy();
    }
}
