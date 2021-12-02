package behavioral.memento;

class Save {
    private String level;
    private int ms;

    Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    String getLevel() {
        return level;
    }
    int getMs() {
        return ms;
    }
}
