
/**
 * Nom:Aboubakar Demba
 * projet: Plus grand nombre et index
 * date:13-10-2023
 */
import java.util.Scanner;

//class main
public class PlusGrandeValeur {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TableauArray tab1 = new TableauArray(15);/** Creation de l objet Tab1 */
        TableauLinkedList tab2 = new TableauLinkedList(15);/** Creation de l objet Tab1 */
        tab1.Affichage();/** Affiche menu */
        int entree = scanner.nextInt();

        switch (entree) {
            case 1:
                tab1.clasrand(0, 100);
                /**
                 * Remplir le tableau avec des valeurs entre 0 et 100 car notre fonction
                 * classrand a ete creer avec min et max donc min =0 et max=100
                 */

                int valumaxA = tab1.trieArray(); // Trie retourn maximun et ca sera stocket dans valumax
                int indMArr = tab1.IndexArray();
                int indMLink = tab1.IndexArray();
                System.out.println(tab1);
                System.out.println("Le plus grand nombre est : " + valumaxA + "  il est a l index : " + indMArr);

                break;// pour sortir
            case 2:
                tab2.clasrand(0, 100); // Remplir le tableau avec des valeurs entre 0 et 100

                int valumax = tab2.trieLinked();
                /**
                 * la valeur retourner dans la fonction TrieLinked ( retourn maximun) sera
                 * stocket dans valumax
                 */
                int indM = tab2.IndexLinked();
                /**
                 * la valeur retourner dans la fonction IndexLinked ( retourn maximun) sera
                 * stocket dans indM
                 */
                System.out.println(tab2);
                System.out.println("Le plus grand nombre est : " + valumax + "  il est a l index : " + indM);

                break;// pour sortir

            case 3:
                System.out.println("Tache Terminer");
                scanner.close();
                break;// pour sortir
            case 4:
                // revien au menu
                break;// pour sortir
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
        }
    }
}
