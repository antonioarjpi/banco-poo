package banco.domain;

public class AccountSavings extends Account{

    public AccountSavings(Client client) {
        super(client);
    }

    public void printExtract(){
        System.out.println("====== Extrato Conta Poupança ======");
        super.printExtract();
        System.out.println("------------------------------------");
    }
}
