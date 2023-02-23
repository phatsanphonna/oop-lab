package lab06.question1;

public class Programmer extends Employee {
    private int happiness;

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void coding(String str) {
        if (super.getEnergy() >= 30) {
            System.out.printf("Your code is %s\n", str);
        } else {
            System.out.println("Error Error Error");
        }

        super.setEnergy(super.getEnergy() - 30);
        this.setHappiness(this.getHappiness() - 30);
    }

    public void coding(char str) {
        if (super.getEnergy() >= 30) {
            System.out.printf("Your code is %c\n", str);
        } else {
            System.out.println("Error Error Error");
        }

        super.setEnergy(super.getEnergy() - 30);
        this.setHappiness(this.getHappiness() - 30);
    }
}
