package lab12.chatapp;

import javax.swing.*;
import java.awt.*;

public class ChatDemoView extends JFrame {
    public JPanel bottomPanel, operationPanel;
    public JTextField messageTextField;
    public JTextArea chatTextArea;
    public JButton submitButton, resetButton;

    ChatDemoView() {
        init();
    }

    public void init() {
        this.setTitle("Chat Application");

        this.setLayout(new BorderLayout());

        chatTextArea = new JTextArea();
        chatTextArea.setColumns(45);
        chatTextArea.setRows(20);
        chatTextArea.setEditable(false);

        this.add(chatTextArea, BorderLayout.CENTER);

        operationPanel = new JPanel(new FlowLayout());

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        operationPanel.add(submitButton);
        operationPanel.add(resetButton);

        messageTextField = new JTextField();

        bottomPanel = new JPanel(new GridLayout(2, 1));
        bottomPanel.add(messageTextField);
        bottomPanel.add(operationPanel);

        this.add(bottomPanel, BorderLayout.SOUTH);
    }

    public void start() {
        this.pack();
        this.setVisible(true);
    }
}
