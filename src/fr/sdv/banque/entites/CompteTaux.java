package fr.sdv.banque.entites;

public class CompteTaux extends Compte {

    private double remuneration;

    public CompteTaux(int id, double solde, double remuneration) {
        super(id, solde);
        this.remuneration = remuneration;
    }

    @Override
    public String toString() {
        return super.toString() + "rémunération: " + remuneration;
    }
}
