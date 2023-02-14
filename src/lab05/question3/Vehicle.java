package lab05.question3;

public class Vehicle {
    private int fuel;
    private String topSpeed;

    protected void setFuel(int fuel) {
        this.fuel = fuel;
    }

    protected int getFuel() {
        return fuel;
    }

    protected void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    protected String getTopSpeed() {
        return topSpeed;
    }

    public void showInfo() {
        System.out.printf("Fuel is %d litre and Top Speed is %s m/s.\n", this.getFuel(), this.getTopSpeed());
    }
}
