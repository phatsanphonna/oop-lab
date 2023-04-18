package lab12.studentprofile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.Scanner;

public class StudentController implements ActionListener, WindowListener {
    private final StudentView view;
    private Student student;
    private File file;

    public StudentController(StudentView view) {
        this.view = view;

        this.initializeListener();
        this.initializeStudent();
        this.getView().start();
    }

    private StudentView getView() {
        return view;
    }

    public Student loadFile() {
        System.out.println("Loading...");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Student data = (Student) objectInputStream.readObject();

            System.out.println(data);

            fileInputStream.close();
            objectInputStream.close();

            return data;
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
            return new Student();
        }
    }

    public void saveFile() {
        System.out.println("Saving...");

        this.setStudentData();

        System.out.println(this.student.getID() + this.student.getName() + this.student.getMoney());

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.student);

            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void initializeData() {
        System.out.println("Initializing Data...");

        this.getView().idTextField.setText(Integer.toString(this.student.getID()));
        this.getView().nameTextField.setText(this.student.getName());
        this.getView().moneyTextField.setText(Integer.toString(this.student.getMoney()));

    }

    private void initializeListener() {
        this.getView().depositButton.addActionListener(this);
        this.getView().withdrawButton.addActionListener(this);
        this.getView().addWindowListener(this);
    }

    private void initializeStudent() {
        System.out.println("Initializing...");

        try {
            file = new File("StudentM.dat");
            file.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void setStudentData() {
        this.student.setID(Integer.parseInt(this.getView().idTextField.getText()));
        this.student.setName(this.getView().nameTextField.getText());
        this.student.setMoney(Integer.parseInt(this.getView().moneyTextField.getText()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.getView().depositButton)) {
            this.student.setMoney(this.student.getMoney() + 100);
        } else if (e.getSource().equals(this.getView().withdrawButton)) {
            this.student.setMoney(this.student.getMoney() - 100);
        }

        this.getView().moneyTextField.setText(Integer.toString(this.student.getMoney()));
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.student = this.loadFile();
        this.initializeData();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.saveFile();
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
