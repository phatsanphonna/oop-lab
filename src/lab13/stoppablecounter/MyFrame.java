package lab13.stoppablecounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    public MyClock clock;
    public Thread thread;

    public MyFrame() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        clock = new MyClock();
        this.add(clock, BorderLayout.CENTER);

        clock.addMouseListener(this);
        this.setSize(new Dimension(500, 300));
        this.setVisible(true);

        thread = new Thread(clock);
        thread.start();
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public synchronized void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(clock)) {
            clock.toggleWait();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
