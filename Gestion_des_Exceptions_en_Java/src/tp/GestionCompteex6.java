package tp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionCompteex6 {
	 public static void main(String[] args) {
	        CompteBancaire compte = new CompteBancaire(500.0); 
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Entrez un montant à retirer : ");
	            double montant = scanner.nextDouble();

	         
	            compte.retirer(montant);
	        } catch (InputMismatchException e) {
	            System.out.println("Erreur : Vous devez entrer un nombre valide.");
	        } catch (MontantNegatifException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	            System.out.println("Opération terminée.");
	        }
	    }

}
