package tp;

public class CompteBancaireex6 {
	 private double solde;

	    public CompteBancaireex6(double soldeInitial) {
	        this.solde = soldeInitial;
	    }

	    public void verser(double montant) throws MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Erreur : Le montant à déposer ne peut pas être négatif.");
	        }
	        solde += montant;
	        System.out.println("Dépôt effectué. Nouveau solde : " + solde);
	    }

	    public void retirer(double montant) throws MontantNegatifException, SoldeInsuffisantException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
	        }
	        if (montant > solde) {
	            throw new SoldeInsuffisantException("Erreur : Solde insuffisant.");
	        }
	        solde -= montant;
	        System.out.println("Retrait effectué. Nouveau solde : " + solde);
	    }

	    public double getSolde() {
	        return solde;
	    }

}
