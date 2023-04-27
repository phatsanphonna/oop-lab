package lab13.stoppablecounter;

import javax.swing.*;
import java.awt.*;

public class MyClock extends JLabel implements Runnable {
    private boolean isWait = false;

    public MyClock() {
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Calibri", Font.PLAIN, 90));
    }

    public synchronized void toggleWait() {
        if (isWait) {
            isWait = false;
            this.notify();
        } else {
            isWait = true;
        }
    }

    @Override
    public void run() {
        int hour = 0;
        int min = 0;
        int sec = 0;

        while (true) {
            synchronized (this) {
                while (isWait) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

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
