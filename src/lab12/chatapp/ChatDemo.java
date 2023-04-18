package lab12.chatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ChatDemo implements ActionListener, WindowListener {
    private final ChatDemoView view;
    private File chatFile;

    ChatDemo(ChatDemoView view) {
        this.view = view;

        this.initializeListener();
        this.initializeLocalChat();
        this.getView().start();
    }

    private ChatDemoView getView() {
        return this.view;
    }


    public String loadText() {
        System.out.println("Loading...");

        String data = "";

        try {
            Scanner scanner = new Scanner(chatFile);
            System.out.println(scanner.hasNextLine());

            while (scanner.hasNextLine()) {
                data += scanner.nextLine();
            }
            scanner.close();

            System.out.println(data);

            return data;
        } catch (IOException exception) {
            exception.printStackTrace();
            return data;
        }
    }

    public void saveText() {
        System.out.println("Saving...");

        try {
            FileWriter writer = new FileWriter("ChatDemo.dat");
            writer.write(this.getView().chatTextArea.getText());
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void initializeListener() {
        this.getView().submitButton.addActionListener(this);
        this.getView().addWindowListener(this);
    }

    private void initializeLocalChat() {
        System.out.println("Initializing...");

        try {
            chatFile = new File("ChatDemo.dat");
            chatFile.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (
                e.getSource().equals(getView().submitButton)
                        && this.getView().messageTextField.getText().length() == 0
        ) {

            String message = this.getView().messageTextField.getText();
            String chat = this.getView().chatTextArea.getText() + this.getTime() + " : " + message + "\n";

            this.getView().chatTextArea.setText(chat);
            this.getView().messageTextField.setText("");
        } else if (e.getSource().equals(this.getView().resetButton)) {
            this.getView().chatTextArea.setText("");
            this.getView().messageTextField.setText("");
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        String chat = this.loadText();
        this.getView().chatTextArea.setText(chat);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.saveText();
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
}
