package tp;

public class Division {
	 public static void main(String[] args) {
	        int numerateur = 10;
	        int diviseur = 0;

	        try {
	          
	            int resultat = numerateur / diviseur;
	            System.out.println("Résultat de la division : " + resultat);
	        } catch (ArithmeticException e) {
	          
	            System.out.println("Erreur : Division par zéro n'est pas autorisée.");
	        } finally {
	       
	            System.out.println("Programme terminé.");
	        }
	    }
	}

