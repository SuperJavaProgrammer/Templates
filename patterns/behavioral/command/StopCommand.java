package behavioral.command;

class StopCommand implements Command {
    private Computer comp;

    StopCommand(Computer comp){
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.stop();
    }
}
