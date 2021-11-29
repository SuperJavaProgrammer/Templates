package generating.abstractFactory;

//Абстрактная фабрика - позволяет создавать семейства связанных объектов, не привязываясь к конкретный классам создаваемых объектов
public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = DeviceFactory.getFactoryByCountryCode("ru");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        TouchPad touchPad = factory.getTouchPad();
        mouse.click();
        keyboard.print();
        touchPad.track(30, 60);

        factory = DeviceFactory.getFactoryByCountryCode("en");
        mouse = factory.getMouse();
        keyboard = factory.getKeyboard();
        touchPad = factory.getTouchPad();
        mouse.click();
        keyboard.print();
        touchPad.track(30, 60);

        factory = DeviceFactory.getFactoryByCountryCode("fr");
    }
}
