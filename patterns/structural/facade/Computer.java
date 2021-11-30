package structural.facade;

class Computer {
    private Power power = new Power();
    private DVD dvd = new DVD();
    private HDD hdd = new HDD();

    void copy() {
        power.on();
        dvd.load();
        hdd.copy(dvd);
    }
}
