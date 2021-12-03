package behavioral.command;

//превращает запросы в объекты, позволяя передавать их как объекты при вызове методов
public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new ResetCommand(comp));
            user.startComp();
            user.stopComp();
            user.resetComp();
    }
}
