package banco.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name = "Digital Innovation One";
    private List<Account> accounts = new ArrayList<>();

    public List<Account> printAccounts(){
        return accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
