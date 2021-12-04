package behavioral.mediator;

class Admin implements User {
    private Chat chat;
    Admin(Chat chat){
        this.chat = chat;
    }
    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
    @Override
    public void getMessage(String message) {
        System.out.println("Admin receive " + message);
    }
}
