package generating.abstractFactory;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("EnPrint");
    }
    @Override
    public void println() {
        System.out.println("EnPrintln");
    }
}
