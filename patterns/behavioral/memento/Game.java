package behavioral.memento;

class Game {
    private String level;
    private int ms;

    void set(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    Save save(){
        return new Save(level, ms);
    }
    void load(Save save){
        level = save.getLevel();
        ms = save.getMs();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}
