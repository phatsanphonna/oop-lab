package lab13.poring;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Poring extends JFrame implements Runnable, MouseListener {
    public JLabel cutiePoring;
    public int totalPoring;

    public Poring(int totalPoring) {
        this.totalPoring = totalPoring;
    }

    @Override
    public void run() {
        ImageIcon img = new ImageIcon("Poring.png");
        cutiePoring = new JLabel();
        cutiePoring.addMouseListener(this);
        this.add(cutiePoring);

        JLabel totalPoringLabel = new JLabel(Integer.toString(totalPoring));
        totalPoringLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
        this.add(totalPoringLabel);

        totalPoringLabel.addMouseListener(this);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setSize(new Dimension(500, 300));
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(cutiePoring)) {
            this.dispose();
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
