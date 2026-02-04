package ex2;

/**
 * Représente un compte courant avec un solde et un découvert autorisé.
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvertAutorise : montant maximal autorisé en négatif
     */
    private double decouvertAutorise;

    /**
     * @param solde             solde initial du compte
     * @param decouvertAutorise montant de découvert autorisé
     */
    public CompteBancaire(double solde, double decouvertAutorise) {
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant montant à créditer
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant si le découvert autorisé n'est pas dépassé.
     *
     * @param montant montant à débiter
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvertAutorise) {
            this.solde -= montant;
        }
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvertAutorise
     *
     * @return the decouvertAutorise
     */
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    /**
     * Setter
     *
     * @param decouvertAutorise the decouvertAutorise to set
     */
    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }
}
