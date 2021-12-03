package behavioral.chain;

class FileLogger extends Logger {
    FileLogger(int priority) {
        super(priority);
    }
    void write(String message) {
        System.out.println("File=" + message);
    }
}
