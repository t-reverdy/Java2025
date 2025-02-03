package fr.sdv.banque.entites;

public class Compte {

    private int numero;
    private double solde;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("id=").append(numero);
        sb.append(", solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
