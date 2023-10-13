
import java.util.Scanner;

//class main
public class PlusGrandeValeur {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TableauArray tab1 = new TableauArray(15);/**Creation de l objet Tab1*/
        TableauLinkedList tab2 = new TableauLinkedList(15);/**Creation de l objet Tab1*/
        tab1.Affichage();
        int entree = scanner.nextInt();
      


        switch (entree) {
            case 1:
        tab1.clasrand(0, 100); // Remplir le tableau avec des valeurs entre 0 et 100

        int valumaxA = tab1.trieArray(); //Trie retourn maximun et ca sera stocket dans valumax
        int indMArr = tab1.IndexArray();
         int indMLink = tab1.IndexArray();
        System.out.println(tab1);
        System.out.println("Le plus grand nombre est : " +valumaxA +  "  il est a l index : "+indMArr);

                break;
            case 2:
                  tab2.clasrand(0, 100); // Remplir le tableau avec des valeurs entre 0 et 100

        int valumax = tab2.trieLinked(); //Trie retourn maximun et ca sera stocket dans valumax
        int indM = tab2.IndexLinked();
        System.out.println(tab2);
        System.out.println("Le plus grand nombre est : " +valumax +  "  il est a l index : "+indM);
        
                break;
         
            case 3:
                System.out.println("Tache Terminer");
                scanner.close();
                break;
             case 4:
             //revien au menu
                 break;
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
        }
    }
}
