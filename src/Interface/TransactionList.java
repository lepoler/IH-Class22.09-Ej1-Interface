package Interface;

import classes.Transaction;

import java.util.ArrayList;

public interface TransactionList {

    Transaction getLastTransaction();
    void addTransaction(Transaction anyName);
    Transaction getTransactionByDay(String fecha);
    ArrayList<Transaction> getAllTransaction();

}






