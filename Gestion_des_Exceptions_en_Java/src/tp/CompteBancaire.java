package tp;

public class CompteBancaire {
	private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void verser(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à déposer ne peut pas être négatif.");
        }
        solde += montant;
        System.out.println("Dépot effectué. Nouveau solde : " + solde);
    }

    public void retirer(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
        }
        if (montant > solde) {
            System.out.println("Erreur : Solde insuffisant.");
        } else {
            solde -= montant;
            System.out.println("Retrait effectué. Nouveau solde : " + solde);
        }
    }

    public double getSolde() {
        return solde;
    }

}
