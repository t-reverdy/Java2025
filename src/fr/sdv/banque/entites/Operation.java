package fr.sdv.banque.entites;

public abstract class Operation {
    protected String date;
    protected float montant;

    public Operation(float montant, String date) {
        this.montant = montant;
        this.date = date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public float getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operation{ ");
        sb.append(afficherType()).append(" : ");
        sb.append("date='").append(date).append('\'');
        sb.append(", montant=").append(montant);
        sb.append('}');
        return sb.toString();
    }

    public abstract String afficherType();

}
