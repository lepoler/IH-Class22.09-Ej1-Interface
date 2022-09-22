package classes;

public class Account {

    String name; //El ejercicio me pide estos parametros
    String adress; //El ejercicio me pide estos parametros
    String accountName; //El ejercicio me pide estos parametros
    int balance; //El ejercicio me pide estos parametros

    public Account(String name, String adress, String accountName, int balance) {
        this.name = name;
        this.adress = adress;
        this.accountName = accountName;
        this.balance = balance;
    }

    //Getters & Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}


