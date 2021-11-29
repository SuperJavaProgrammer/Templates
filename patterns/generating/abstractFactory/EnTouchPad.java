package generating.abstractFactory;

public class EnTouchPad implements TouchPad {
    @Override
    public void track(int x, int y) {
        System.out.println("En:" + x + y);
    }
}
