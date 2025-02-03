package fr.sdv.banque;

import fr.sdv.banque.entites.Credit;
import fr.sdv.banque.entites.Debit;
import fr.sdv.banque.entites.Operation;

import java.util.ArrayList;
import java.util.List;

public class TestOperation {
    public static void main(String[] args) {

        List<Operation> operations = new ArrayList<>();

        operations.add(new Credit(1000,"1/1/2025"));
        operations.add(new Debit(250,"2/1/2025"));
        operations.add(new Credit(100,"1/1/2025"));
        operations.add(new Debit(300,"1/1/2025"));

        double total = 0;

        for(Operation operation: operations){
            System.out.println(operation.afficherType());
            System.out.println(operation);

            if(operation.afficherType() == "Crédit"){
                total += operation.getMontant();
            } else {
                total -= operation.getMontant();
            }
        }

        System.out.println(total);
    }
}
