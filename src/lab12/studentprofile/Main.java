package lab12.studentprofile;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        new StudentController(view);
    }
}