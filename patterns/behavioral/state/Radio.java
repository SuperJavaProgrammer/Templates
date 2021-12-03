package behavioral.state;

class Radio {
    private Station station;

    void setStation(Station st) {
        station = st;
    }
    void play() {
        station.play();
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new VestiFM());
        } else if (station instanceof VestiFM) {
            setStation(new Radio7());
        }
    }
}
