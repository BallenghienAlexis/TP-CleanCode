package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMinInclusif;
    private Integer poidsMaxInclusif;

    /**
     * Constructeur
     *
     * @param nom
     * @param poidsMinInclusif
     * @param poidsMaxInclusif
     */
    public Caisse(String nom, int poidsMinInclusif, Integer poidsMaxInclusif) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMinInclusif = poidsMinInclusif;
        this.poidsMaxInclusif = poidsMaxInclusif;
    }

    /**
     * Indique si la caisse accepte l'item selon son poids.
     *
     * @param item item à évaluer
     * @return true si l'item est accepté
     */
    public boolean accepte(Item item) {
        int poids = item.getPoids();
        if (poids < poidsMinInclusif) {
            return false;
        }
        return poidsMaxInclusif == null || poids <= poidsMaxInclusif;
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Getter pour l'attribut poidsMinInclusif
     *
     * @return the poidsMinInclusif
     */
    public int getPoidsMinInclusif() {
        return poidsMinInclusif;
    }

    /**
     * Setter pour l'attribut poidsMinInclusif
     *
     * @param poidsMinInclusif the poidsMinInclusif to set
     */
    public void setPoidsMinInclusif(int poidsMinInclusif) {
        this.poidsMinInclusif = poidsMinInclusif;
    }

    /**
     * Getter pour l'attribut poidsMaxInclusif
     *
     * @return the poidsMaxInclusif
     */
    public Integer getPoidsMaxInclusif() {
        return poidsMaxInclusif;
    }

    /**
     * Setter pour l'attribut poidsMaxInclusif
     *
     * @param poidsMaxInclusif the poidsMaxInclusif to set
     */
    public void setPoidsMaxInclusif(Integer poidsMaxInclusif) {
        this.poidsMaxInclusif = poidsMaxInclusif;
    }
}
