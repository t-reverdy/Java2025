import fr.sdv.banque.entites.Compte;
import fr.sdv.banque.entites.CompteTaux;

public class Main {
    public static void main(String[] args) {
        Compte[] tableau = new Compte[2];

        tableau[0] = new Compte(1, 25.43);
        tableau[1] = new CompteTaux(2, 13.99, 10);

        for (Compte compte : tableau) {
            System.out.println(compte);
        }
    }
}