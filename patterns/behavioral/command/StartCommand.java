package behavioral.command;

class StartCommand implements Command {
    private Computer comp;

    StartCommand(Computer comp){
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.start();
    }
}
