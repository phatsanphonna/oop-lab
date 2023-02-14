package lab04.question8;

public class Account {
    public double balance;
    public String name;

    public void deposit(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        } else {
            balance += b;
        }
    }

    public void withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        } else if (this.balance - b < 0) {
            System.out.println("Your account balance is insufficient.");
        } else {
            balance -= b;
        }
    }

    public void showInfo() {
        System.out.printf(
                "In %s account, there is a balance equal to %.1f baht.\n",
                this.name, this.balance
        );
    }
}
