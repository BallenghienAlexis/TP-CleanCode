package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    /**
     * Constructeur par défaut, initialise les caisses.
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 0, 4));
        caisses.add(new Caisse("Moyens objets", 5, 19));
        caisses.add(new Caisse("Grands objets", 20, null));
    }

    /**
     * Ajoute un item dans la première caisse qui l'accepte.
     *
     * @param item item à ajouter
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepte(item)) {
                caisse.getItems().add(item);
                return;
            }
        }
    }

    /**
     * Retourne le nombre total d'items dans l'inventaire.
     *
     * @return total d'items
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
