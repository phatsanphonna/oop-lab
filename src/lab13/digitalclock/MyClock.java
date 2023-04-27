package lab13.digitalclock;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyClock extends JLabel implements Runnable {
    public MyClock() {
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Calibri", Font.PLAIN, 90));
    }

    @Override
    public void run() {

        while (true) {
            Calendar d = Calendar.getInstance();

            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);

            this.setText(String.format("%02d:%02d:%02d", hour, min, sec));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
