package ex3;

/**
 * Représente un animal du zoo.
 */
public class Animal {

    /*  * nom : nom de l'animal
     * type : type de l'animal (ex : mammifère, oiseau, reptile, etc.)
     * comportement : comportement de l'animal (ex : agressif, docile, nocturne, etc.)
     */
    private final String nom;
    private final String type;
    private final String comportement;

    /**
     * @param nom          nom de l'animal
     * @param type         type de l'animal
     * @param comportement comportement de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Getter for comportement
     *
     * @return the comportement
     */
    public String getComportement() {
        return comportement;
    }
}
