package banco.domain;

public class AccountChecking extends Account{

    public AccountChecking(Client client) {
        super(client);
    }

    public void printExtract(){
        System.out.println("====== Extrato Conta Corrente ======");
        super.printExtract();
        System.out.println("------------------------------------");
    }

}
