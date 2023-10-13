
/**La classe contient un tableau régulier. Lorsqu’un élément est ajouté, il est placé dans le tableau. Si la baie n’est pas assez grande, une nouvelle matrice plus grande est créée pour remplacer le l’ancien et l’ancien est supprimé.ArrayList */
import java.util.ArrayList;
import java.util.Random;

public class TableauArray {

    private ArrayList<Integer> tab;

    /** https://www.w3schools.com/java/java_arraylist.asp */

    /** creation d un constructeur personnaliser */

    public TableauArray(int tailletab) {
        this.tab = new ArrayList<>();
    }

    /**
     * creation de la classe de la fonction rondom pour le remplissage aleatoire
     * lien utile
     * https://stackoverflow.com/questions/40696911/get-class-from-arraylist
     * lien utile
     * https://waytolearnx.com/2020/03/la-methode-get-en-java-les-collections.html
     */
    public void clasrand(int min, int max) {
        Random rand = new Random();
        /** creation de la classe de la fonction rondom pour le remplissage aleatoire */
        for (int i = 0; i < 15; i++) {
            tab.add(rand.nextInt(max - min + 1) + min);
        }
    }

    /** Le Menu */
    public void Affichage() {
        // Le menu de l interface utilisateur
        System.out.println("\n Menu :");
        System.out.println("1. Entrez 1 afficher avec ArrayList");
        System.out.println("2. Entrez 2 Afficher avec LiinkedList");
        System.out.println("3. Entrez 3 pour revenir au menu");
        System.out.println("4. Entrez 4 pour Quitter");
        System.out.print(" choisissez une option : ");

    }

    /** Pour avoire le max */
    public int trieArray() {
        int maximun = tab.get(0);
        /** creation dune variable dit maximum initialiser avec tab[0] */
        /**
         * la condition est simple pour i=0 jusqua la taille du tableau 15,si tab[i] est
         * > a la valeur notre variable maximum ( initialiser a tab[0]) il prend la
         * valeur de la plus grande valeur stocker dans le tableau dont maximum
         * contiendra alors le meximum
         */
        for (int i = 0; i < 15; i++) {
            if (tab.get(i) > maximun) {
                maximun = tab.get(i);
            }
        }
        /**
         * lorsquon appelle la fonction trie il retournera automatiquement le maximum
         */
        return maximun;

    }

    /** La class IndexArray a ete creer pour retourner l index du max */
    public int IndexArray() {
        int maximun = tab.get(0);// creation dune variable dit maximum initialiser avec tab[0]
        int MaxInd = 0;
        /**
         * la condition est simple pour i=0 jusqua la taille du tableau 15,si tab[i] est
         * > a la valeur notre variable maximum ( initialiser a tab[0]) il prend la
         * valeur de la plus grande valeur stocker dans le tableau dont maximum
         * contiendra alors le meximum
         */
        for (int i = 0; i < 15; i++) {
            if (tab.get(i) > maximun) {
                MaxInd = i;
            }
        }
        // lorsquon appelle la fonction trie il retournera automatiquement le maximum
        return MaxInd;

    }

    public String toString() {
        StringBuilder build = new StringBuilder("Tableau :\n");
        /**
         * permet de concaténer des chaînes de caractères de manière optimisée
         * lien utile:
         * https://learn.microsoft.com/fr-fr/dotnet/standard/base-types/stringbuilder
         */
        for (int i = 0; i < 15; i++) {
            /**
             * La méthode Append permet d’ajouter du texte ou une représentation sous forme
             * de chaîne d’un objet à la fin d’une chaîne représentée par l’instance
             * actuelle de StringBuilder.
             */
            build.append("tableau ").append("[").append(i).append("]").append("= ").append(tab.get(i)).append("\n");
        }
        return build.toString();

    }

}
