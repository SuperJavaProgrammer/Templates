package behavioral.command;

class User {
    private Command start;
    private Command stop;
    private Command reset;

    User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComp() {
        start.execute();
    }
    void stopComp() {
        stop.execute();
    }
    void resetComp() {
        reset.execute();
    }
}
