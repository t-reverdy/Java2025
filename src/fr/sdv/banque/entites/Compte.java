package fr.sdv.banque.entites;

public class Compte {

    private int numero;
    private float solde;

    public Compte(int numero, float solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte: ");
        sb.append("id=").append(numero);
        sb.append(", solde=").append(solde);
        return sb.toString();
    }
}
