package lab09;

public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount() {
        super(0, "");
        this.credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit < 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }

        this.credit = credit;
    }

    public double getCredit() {
        return this.credit;
    }

    @Override
    public void withdraw(double a) throws WithdrawException {
        if (this.getBalance() - a >= 0) {
            this.setBalance(this.getBalance() - a);
        } else if (this.getBalance() + this.getCredit() - a > 0) {
            this.setCredit(this.getCredit() + (this.getBalance() - a));
            this.setBalance(0);
        } else {
            throw new WithdrawException(
                    String.format("Account %s has not enough money.", this.getName())
            );
        }

        System.out.printf(
                "%.1f baht is withdrawn from %s and your credit balance is %.1f.\n",
                a, this.getName(), this.getCredit()
        );
    }

    public void withdraw(String a) throws WithdrawException {
        this.withdraw(Float.parseFloat(a));
    }

    @Override
    public String toString() {
        return String.format(
                "The %s account has %.1f baht and %.1f credits.",
                this.getName(), this.getBalance(), this.getCredit()
        );
    }
}
