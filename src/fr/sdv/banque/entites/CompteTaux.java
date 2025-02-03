package fr.sdv.banque.entites;

public class CompteTaux extends Compte {

    private float remuneration;

    public CompteTaux(int id, float solde, float remuneration) {
        super(id, solde);
        this.remuneration = remuneration;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", remuneration=").append(remuneration);
        return sb.toString();
    }
}
