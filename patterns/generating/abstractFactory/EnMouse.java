package generating.abstractFactory;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("EnClick");
    }
    @Override
    public void dClick() {
        System.out.println("EnDClick");
    }
    @Override
    public void scroll() {
        System.out.println("EnScroll");
    }
}
