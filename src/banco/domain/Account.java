package banco.domain;

public class Account{

    private static final int agencyPattern = 0001;
    private static int SEQUENTIAL = 1;

    private int agency;
    private int account;
    private double balance;
    private Client client;

    public Account(Client client){
        this.account = Account.agencyPattern;
        this.agency = SEQUENTIAL++;
        this.client = client;
    }

    public void withdrawal(double value){
        balance -=  value;
    }

    public void deposity(double value){
        balance += value;
    }

    public void printExtract(){
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agência: %d", this.agency));
        System.out.println(String.format("Conta: %d", this.account));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

    public void transfer(double value, Account accountDestiny){
        this.withdrawal(value);
        accountDestiny.deposity(value);
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
