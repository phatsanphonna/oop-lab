package lab05.question3;

public class Car extends Vehicle {
    private String typeEngine;

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void showCarInfo() {
        System.out.printf("Car engine is %s.\n", this.getTypeEngine());
        this.showInfo();
    }

    public void setCarInfo(int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        this.setTypeEngine(y);
    }

    public void move() {
        if (this.getFuel() - 50 < 0) {
            System.out.println("Please add fuel.");
            return;
        }

        System.out.println("Move.");
        this.setFuel(this.getFuel() - 50);
    }
}
