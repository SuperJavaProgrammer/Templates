package generating.abstractFactory;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("RuClick");
    }
    @Override
    public void dClick() {
        System.out.println("RuDClick");
    }
    @Override
    public void scroll() {
        System.out.println("RuScroll");
    }
}
