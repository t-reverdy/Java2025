package fr.sdv.geometrie.entites;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimètre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
}
