package lab08;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList();
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

    public Account getAccount(int index) {
        return this.acct.get(index);
    }

    public void addAccount(Account acct) {
        this.acct.add(acct);
    }

    public int getNumOfAccount() {
        return this.acct.size();
    }

    @Override
    public String toString() {
        return String.format("%s %s has %d accounts",
                this.getFirstName(), this.getLastName(), this.getNumOfAccount()
        );
    }

    public boolean equals(Customer c) {
        return c.getFirstName().equals(this.getFirstName())
                && c.getLastName().equals(this.getLastName());
    }

}
