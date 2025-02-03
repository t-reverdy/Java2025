package fr.sdv.banque.entites;

public class Compte {

    private int id;
    private double solde;

    public Compte(int id, double solde) {
        this.id = id;
        this.solde = solde;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("id=").append(id);
        sb.append(", solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
