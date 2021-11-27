package banco;

import banco.domain.*;

public class Main {
    public static void main(String[] args) {

        Client antonio = new Client();
        antonio.setName("Antônio Araújo");

        Client aylton = new Client();
        aylton.setName("Aylton Ferreira");

        Account cheking = new AccountChecking(antonio);
        Account savings = new AccountSavings(antonio);

        Account cheking1 = new AccountChecking(aylton);
        Account savings1 = new AccountSavings(aylton);

        cheking.deposity(200);
        cheking.transfer(100, savings1);

        cheking.printExtract();
        savings.printExtract();

        cheking1.printExtract();
        savings1.printExtract();

    }
}
