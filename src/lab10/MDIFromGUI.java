package lab10;

import javax.swing.*;
import java.awt.*;

public class MDIFromGUI extends JFrame {
    public JDesktopPane desktopPane;
    public JInternalFrame app1, app2, app3;

    public MDIFromGUI() {
        boolean resizable = true;
        boolean closable = true;
        boolean maximizable = true;
        boolean iconifiable = true;

        desktopPane = new JDesktopPane();

        app1 = new JInternalFrame("Application 01", resizable, closable, maximizable, iconifiable);
        app2 = new JInternalFrame("Application 02", resizable, closable, maximizable, iconifiable);
        app3 = new JInternalFrame("Application 03", resizable, closable, maximizable, iconifiable);

        desktopPane.add(app1);
        desktopPane.add(app2);
        desktopPane.add(app3);

        app1.pack();
        app1.setVisible(true);

        app2.pack();
        app2.setVisible(true);

        app3.pack();
        app3.setVisible(true);

        desktopPane.setVisible(true);

        this.setMinimumSize(new Dimension(500, 500));
        this.add(desktopPane);
        this.pack();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MDIFromGUI();
    }
}
