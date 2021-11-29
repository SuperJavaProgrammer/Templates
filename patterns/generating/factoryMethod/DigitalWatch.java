package generating.factoryMethod;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("DigitalWatch " + new Date());
    }
}
