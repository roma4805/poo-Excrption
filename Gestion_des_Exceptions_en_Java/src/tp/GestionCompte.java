package tp;

public class GestionCompte {
	  public static void main(String[] args) {
	        CompteBancaire compte = new CompteBancaire(1000.0); // Solde initial de 1000

	        try {
	            // Tentative de dépôt avec un montant positif
	            compte.verser(500);
	            
	            // Tentative de retrait avec un montant positif
	            compte.retirer(300);
	            
	            // Tentative de retrait avec un montant négatif pour déclencher l'exception
	            compte.retirer(-100);
	            
	        } catch (MontantNegatifException e) {
	            // Capture et affichage du message d'erreur de l'exception
	            System.out.println(e.getMessage());
	        }
	    }

}
