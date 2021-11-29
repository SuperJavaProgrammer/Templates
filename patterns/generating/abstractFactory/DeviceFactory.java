package generating.abstractFactory;

public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchPad();

    static DeviceFactory getFactoryByCountryCode(String code) {
        if (code.equals("ru"))
            return new RuDeviceFactory();
        else if (code.equals("en"))
            return new EnDeviceFactory();
        throw new RuntimeException("Фабрики " + code + " еще нет");
    }
}
