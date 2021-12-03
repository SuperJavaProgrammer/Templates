package behavioral.chain;

//позволяет передавать запросы последовательно по цепочке обработчиков. Каждый обработчик решает, может ли он обрабатывать запрос сам и стоит ли передавать запрос дальше по цепи
public class Main {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);
            smsLogger.setNext(fileLogger);
            fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("All is Ok", Level.INFO);
        smsLogger.writeMessage("All is NORM", Level.DEBUG);
        smsLogger.writeMessage("All is BAD", Level.ERROR);
    }
}
