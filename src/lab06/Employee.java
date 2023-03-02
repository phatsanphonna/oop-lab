package lab06;

public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }

    public boolean equals(Employee e) {
        return this.getName().equals(e.getName());
    }

    @Override
    public String toString() {
        return String.format(
                "My name is %s.\nI have %d energy left.\nI have a balance of %.1f baht.",
                this.getName(), this.getEnergy(), this.getWallet().getBalance()
        );
    }

    public boolean buyFood(Seller s) {
        Food buyedFood = s.sell(this);

        if (buyedFood != null) {
            this.eat(buyedFood);
            return true;
        } else {
            return false;
        }
    }

    public void eat(Food f) {
        this.setEnergy(this.getEnergy() + f.getEnergy());
    }
}
