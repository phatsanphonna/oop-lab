package lab13.poring;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class PoringConstructor extends JFrame implements ActionListener, WindowListener {
    public int poringCounter = 1;
    public JButton btn;

    public ArrayList<Thread> runningThreads = new ArrayList<>();

    public PoringConstructor() {
        this.setLayout(new FlowLayout());

        btn = new JButton("Add");
        btn.addActionListener(this);

        this.add(btn);
        this.addWindowListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn)) {
            Poring poring = new Poring(poringCounter);
            Thread thread = new Thread(poring);
            thread.start();

            this.runningThreads.add(thread);
            this.poringCounter++;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        for (Thread thread : runningThreads) {
            thread.interrupt();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new PoringConstructor();
    }
}
