package fr.sdv.banque.entites;

public class Credit extends Operation {


    public Credit(int montant, String date) {
        super(montant, date);
    }

    @Override
    public String afficherType() {
        return "Crédit";
    }
}
