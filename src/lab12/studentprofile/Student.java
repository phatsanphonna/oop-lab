package lab12.studentprofile;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int ID;
    private int money;

    public Student() {
    }

    public Student(String name, int ID, int money) {
        this.setName(name);
        this.setID(ID);
        this.setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
