package fr.sdv.banque.entites;

public abstract class Operation {
    private String date;
    private int montant;

    public Operation(int montant, String date) {
        this.montant = montant;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Operation{");
        sb.append("date='").append(date).append('\'');
        sb.append(", montant=").append(montant);
        sb.append('}');
        return sb.toString();
    }

    public abstract String afficherType();

}
