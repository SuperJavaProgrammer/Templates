package generating.abstractFactory;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("RuPrint");
    }
    @Override
    public void println() {
        System.out.println("RuPrintln");
    }
}
