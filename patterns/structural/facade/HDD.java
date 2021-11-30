package structural.facade;

class HDD {
    void copy(DVD dvd) {
        System.out.println(dvd.hasData() ? "DVD has data" : "No data");
    }
}
