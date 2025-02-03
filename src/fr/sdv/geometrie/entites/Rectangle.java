package fr.sdv.geometrie.entites;

public class Rectangle implements ObjetGeometrique{
    private double longueur;
    private double largeur;

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimètre() {
        return 2 * longueur + 2 * largeur;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }
}
