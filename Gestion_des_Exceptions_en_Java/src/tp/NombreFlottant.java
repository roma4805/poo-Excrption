package tp;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NombreFlottant {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez un nombre : ");
            float nombre = scanner.nextFloat(); 
            System.out.println("Vous avez entré le nombre : " + nombre);
        } catch (InputMismatchException e) {
       
            System.out.println("Erreur : Vous devez entrer un nombre valide.");
        } finally {

            scanner.close();
        }
    }

}
