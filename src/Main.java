import fr.sdv.banque.entites.Compte;
import fr.sdv.banque.entites.CompteTaux;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> nombres = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            nombres.add(i);
        }

        System.out.println(nombres.size());
    }
}