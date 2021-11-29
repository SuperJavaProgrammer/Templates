package generating.abstractFactory;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }
    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }
    @Override
    public TouchPad getTouchPad() {
        return new RuTouchPad();
    }
}
