package generating.abstractFactory;

public class RuTouchPad implements TouchPad {
    @Override
    public void track(int x, int y) {
        System.out.println("Ru:" + x + y);
    }
}
