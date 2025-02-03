package fr.sdv.banque.entites;

public class Debit extends Operation{


    public Debit(float montant, String date) {
        super(montant, date);
    }

    @Override
    public String afficherType() {
        return "Débit";
    }
}
