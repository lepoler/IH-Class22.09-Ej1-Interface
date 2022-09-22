package classes;

import Interface.TransactionList;

import java.util.ArrayList;
import java.util.List;

public class PaymentList implements TransactionList {

    List<Transaction> TransactionList = new ArrayList<>(); //Es de la clase (object) Transaction, pero como lo tengo
                                        //que llamar desde esta clase, tengo que instanciar el ArrayList aquí.
                                        // NO EN LA CLASE

    public Transaction getLastTransaction() {

        return TransactionList.get(TransactionList.size()-1); //No me lo pide el ejercicio, pero aplico la lógica para
                                            // llamar al método.
    }


    public void addTransaction(Transaction anyName) { //No me lo pide el ejercicio, pero aplico la lógica para
        TransactionList.add(anyName);                   // llamar al método.

    }


    public Transaction getTransactionByDay(String fecha) { //No se encontrar la logica
        return null;
    }


    public ArrayList<Transaction> getAllTransaction() {
        return null;
    }
}
