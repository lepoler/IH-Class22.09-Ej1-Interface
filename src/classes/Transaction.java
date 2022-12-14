package classes;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private int sellerAccountNumber; //El ejercicio me pide estos parametros
    private int buyerAccountNumber; //El ejercicio me pide estos parametros
    private int amount; //El ejercicio me pide estos parametros
    private String date; //El ejercicio me pide estos parametros



    public Transaction(int sellerAccountNumber, int buyerAccountNumber, int amount, String date, List<Object> transaaction) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date; //LocalDate > te coge la fecha exacta

    }

//Getters & Setters:

    public int getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public int getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
