package lab12.studentprofile;

import javax.swing.*;
import java.awt.*;

public class StudentView extends JFrame {
    public JLabel idLabel, nameLabel, moneyLabel;
    public JTextField idTextField, nameTextField, moneyTextField;
    public JButton depositButton, withdrawButton;

    public StudentView() {
        this.init();
    }

    private void init() {
        this.setTitle("Student Profile");

        this.setLayout(new GridLayout(4, 2));

        idLabel = new JLabel("ID:");
        nameLabel = new JLabel("Name:");
        moneyLabel = new JLabel("Money:");

        idTextField = new JTextField();
        nameTextField = new JTextField();
        moneyTextField = new JTextField();

        this.moneyTextField.setText(Integer.toString(100));
        this.moneyTextField.setEditable(false);

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");

        this.add(idLabel);
        this.add(idTextField);
        this.add(nameLabel);
        this.add(nameTextField);
        this.add(moneyLabel);
        this.add(moneyTextField);
        this.add(depositButton);
        this.add(withdrawButton);
    }

    public void start() {
        this.pack();
        this.setVisible(true);
    }
}
