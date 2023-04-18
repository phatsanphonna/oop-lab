package lab09;

public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer() {
        this("", "", null);
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    @Override
    public String toString() {
        if (this.acct == null) {
            return String.format(
                    "%s %s doesn’t have account.",
                    this.getFirstName(), this.getLastName()
            );
        } else {
            return String.format(
                    "The %s account has %.1f baht and %.1f credits.",
                    this.getFirstName(), this.getAcct().getBalance(), this.getAcct().getCredit()
            );
        }
    }

    public boolean equals(Customer c) {
        return c.getFirstName().equals(this.getFirstName())
                && c.getLastName().equals(this.getLastName());
    }


}
