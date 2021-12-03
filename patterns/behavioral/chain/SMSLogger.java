package behavioral.chain;

class SMSLogger extends Logger {
    SMSLogger(int priority) {
        super(priority);
    }
    void write(String message) {
        System.out.println("SMS=" + message);
    }
}
