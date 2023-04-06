package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lab08.Account;

public class TellerGUI implements ActionListener {
    JFrame frame;
    JPanel balancePanel, amountPanel, operationPanel;
    JButton depositButton, withdrawButton, exitButton;
    JTextField balanceTextField, amountTextField;
    JLabel balanceLabel, amountLabel;
    public Account account;

    public TellerGUI() {
        this.account = new Account(6000, "");

        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(4, 1));

        balancePanel = new JPanel();
        balancePanel.setLayout(new GridLayout(1, 2));

        balanceLabel = new JLabel("Balance");
        balanceTextField = new JTextField(account.getBalance() + "");
        balanceTextField.setEditable(false);

        balancePanel.add(balanceLabel);
        balancePanel.add(balanceTextField);

        frame.add(balancePanel);

        amountPanel = new JPanel();
        amountPanel.setLayout(new GridLayout(1, 2));

        amountLabel = new JLabel("Amount");
        amountTextField = new JTextField();

        amountPanel.add(amountLabel);
        amountPanel.add(amountTextField);

        frame.add(amountPanel);

        operationPanel = new JPanel();
        operationPanel.setLayout(new GridLayout(1, 3));

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");

        operationPanel.add(depositButton);
        operationPanel.add(withdrawButton);
        operationPanel.add(exitButton);

        frame.add(operationPanel);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double amount = Double.parseDouble(this.amountTextField.getText());

        if (e.getSource().equals(this.depositButton)) {
            this.account.deposit(amount);
        } else if (e.getSource().equals(this.withdrawButton)) {
            this.account.withdraw(amount);
        }

        this.balanceTextField.setText(this.account.getBalance() + "");
    }

    public static void main(String[] args) {
        TellerGUI tellerGUI = new TellerGUI();

        tellerGUI.depositButton.addActionListener(tellerGUI);
        tellerGUI.withdrawButton.addActionListener(tellerGUI);
    }
}
