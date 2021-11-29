package generating.abstractFactory;

public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }
    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }
    @Override
    public TouchPad getTouchPad() {
        return new EnTouchPad();
    }
}
