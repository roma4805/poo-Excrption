package tp;

import java.util.Scanner;

public class ConversionNombre {

  
    public static int convertirEnEntier(String nombre) {
        try {
           
            int resultat = Integer.parseInt(nombre);
            System.out.println("Conversion réussie : " + resultat);
            return resultat;
        } catch (NumberFormatException e) {
   
            System.out.println("Erreur : La saisie '" + nombre + "' n'est pas un nombre valide.");
            return 0; 
        } finally {
          
            System.out.println("Bloc finally : Conversion terminée.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre : ");
        String saisie = scanner.nextLine();


        convertirEnEntier(saisie);

        scanner.close();
    }
}
