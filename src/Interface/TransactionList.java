package Interface;

import classes.Transaction;

import java.util.ArrayList;

public interface TransactionList {

    Transaction getLastTransaction(); //Me tiene que retornar de la clase (object) Transaction
    void addTransaction(Transaction anyName); //no me devuelve proque es void, pero tiene que provenir de Transaction >
                                                // le puedo poner cualquier nombre (anyName
    Transaction getTransactionByDay(String fecha); //Me tiene que retornar de la clase (object) Transaction
    ArrayList<Transaction> getAllTransaction(); //Me tiene que retornar de la clase (object) Transaction, pero que sea
                                                    // un ArrayList

}






