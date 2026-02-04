package ex2;

/**
 * Représente un livret A sans découvert, avec un taux de rémunération annuel.
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération annuel
     */
    private double tauxRemuneration;

    /**
     * @param solde            solde initial
     * @param tauxRemuneration taux de rémunération annuel
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Débite un montant sans jamais passer le solde en négatif.
     *
     * @param montant montant à débiter
     */
    @Override
    public void debiterMontant(double montant) {
        if (getSolde() - montant >= 0) {
            setSolde(getSolde() - montant);
        }
    }

    /**
     * Applique la rémunération annuelle au solde.
     */
    public void appliquerRemunerationAnnuelle() {
        setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Le livret A ne permet pas de découvert.
     *
     * @param decouvertAutorise ignoré
     */
    @Override
    public void setDecouvertAutorise(double decouvertAutorise) {
        super.setDecouvertAutorise(0);
    }
}
