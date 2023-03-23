package lab08;

import java.sql.Array;

public class Bank {
    private Account[] acct;
    private int numAcct = 0;

    public Bank() {
        acct = new Account[10];
    }

    public void addAccount(Account ac) {
        acct[this.getNumAccount()] = ac;
        this.numAcct++;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumAccount() {
        return this.numAcct;
    }
}
