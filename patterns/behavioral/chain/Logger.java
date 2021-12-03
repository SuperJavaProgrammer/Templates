package behavioral.chain;

abstract class Logger {
    private int priority;
    private Logger next;

    Logger(int priority) {
        this.priority = priority;
    }

    void setNext(Logger next) {
        this.next = next;
    }
    abstract void write(String message);

    void writeMessage(String message, int level) {
        if(level <= priority)
            write(message);
        if(next != null)
            next.writeMessage(message, level);
    }
}
