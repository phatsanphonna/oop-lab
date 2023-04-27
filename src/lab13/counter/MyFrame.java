package lab13.counter;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyClock clock;

    public MyFrame() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        clock = new MyClock();
        this.add(clock, BorderLayout.CENTER);

        this.setSize(new Dimension(500, 300));
        this.setVisible(true);

        Thread t = new Thread(clock);
        t.start();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
