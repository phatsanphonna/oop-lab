package lab13.counter;

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
        int hour = 0;
        int min = 0;
        int sec = 0;

        while (true) {
            sec++;

            if (sec > 59) {
                min++;
                sec = 0;
            }

            if (min > 59) {
                hour++;
                min = 0;
            }

            this.setText(String.format("%02d:%02d:%02d", hour, min, sec));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
