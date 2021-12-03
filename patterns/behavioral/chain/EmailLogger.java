package behavioral.chain;

class EmailLogger extends Logger {
    EmailLogger(int priority) {
        super(priority);
    }
    void write(String message) {
        System.out.println("Email=" + message);
    }
}
