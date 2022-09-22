package classes;

import Interface.TransactionList;

import java.util.ArrayList;
import java.util.List;

public class PaymentList implements TransactionList {

    List<Transaction> TransactionList = new ArrayList<>();



    public Transaction getLastTransaction() {

        return TransactionList.get(TransactionList.size()-1);
    }


    public void addTransaction(Transaction anyName) {
        TransactionList.add(anyName);

    }


    public Transaction getTransactionByDay(String fecha) {
        return null;
    }


    public ArrayList<Transaction> getAllTransaction() {
        return null;
    }
}
