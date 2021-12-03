package behavioral.command;

class ResetCommand implements Command {
    private Computer comp;

    ResetCommand(Computer comp){
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.reset();
    }
}
