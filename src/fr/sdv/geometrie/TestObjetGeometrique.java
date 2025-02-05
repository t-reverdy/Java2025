package fr.sdv.geometrie;

import fr.sdv.geometrie.entites.Cercle;
import fr.sdv.geometrie.entites.ObjetGeometrique;
import fr.sdv.geometrie.entites.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        objets[0] = new Cercle(1);
        objets[1] = new Rectangle(3,2);

        for (ObjetGeometrique obj : objets) {
            System.out.println(obj.perimètre());
            System.out.println(obj.surface());
        }
    }
}
