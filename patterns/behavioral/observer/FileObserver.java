package behavioral.observer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pres) {
        var gc = new GregorianCalendar();
        int year = gc.get(Calendar.YEAR);
        int month = gc.get(Calendar.MONTH);
        int day = gc.get(Calendar.DAY_OF_MONTH);
        int hour = gc.get(Calendar.HOUR_OF_DAY);
        int minute = gc.get(Calendar.MINUTE);
        int second = gc.get(Calendar.SECOND);
        String fileName = year + "-" + month + "-" + day + "-" + hour + "-" + minute + "-" + second + ".txt";
        try (var f = new FileOutputStream(fileName)) {
            String data = "Погода изменилась. Температура=" + temp + ", Давление=" + pres;
            f.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
