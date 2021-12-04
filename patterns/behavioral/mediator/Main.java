package behavioral.mediator;

//позволяет уменьшить связанность многих классов между собой благодаря перемещению этих связей в один класс посредник
public class Main {
    public static void main(String[] args) {
        var chat = new TextChat();
        var admin = new Admin(chat);
        var u1 = new SimpleUser(chat);
        var u2 = new SimpleUser(chat);
        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        u1.sendMessage("Hello from u1");
        admin.sendMessage("Hello from admin");
    }
}
