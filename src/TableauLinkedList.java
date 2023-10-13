import java.util.LinkedList;
import java.util.Random;

public class TableauLinkedList {
    /**
     * Le stocke ses articles dans des « conteneurs ». La liste contient un lien
     * vers le premier conteneur et chaque conteneur a un lien vers le conteneur
     * suivant dans la liste. Pour ajouter un élément à la liste, l’élément est
     * placé dans un nouveau conteneur et ce conteneur est lié à l’un des autres
     * conteneurs dans la liste.LinkedList
     */
    private LinkedList<Integer> tab;

    /** creation d un constructeur personnaliser */

    public TableauLinkedList(int tailletab) {
        this.tab = new LinkedList<>();/** https://www.w3schools.com/java/java_linkedlist.asp */
    }

    /** creation de la classe de la fonction rondom pour le remplissage aleatoire */

    public void clasrand(int min, int max) {
        Random rand = new Random();// donne des valeur aleatoire
        /**
         * https://developer.mozilla.org/fr/docs/Web/JavaScript/Reference/Global_Objects/Math/random
         */
        for (int i = 0; i < 15; i++) {
            int stockage = rand.nextInt(max - min + 1) + min; 
            tab.add(stockage);/**https://stacklima.com/definir-la-methode-add-en-java-avec-des-exemples/#:~:text=La%20m%C3%A9thode%20add%20%28%29%20de%20Set%20en%20Java,False%20si%20l%E2%80%99%C3%A9l%C3%A9ment%20est%20d%C3%A9j%C3%A0%20pr%C3%A9sent%20dans%20l%E2%80%99ensemble. */
        }
    }

    /** Pour avoire le max */
    public int trieLinked() {
        int maximun = tab.get(0);// creation dune variable dit maximum initialiser avec tab[0]
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

    public int IndexLinked() {
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
        StringBuilder build = new StringBuilder("Tableau :\n"); // lien utile:
                                                                // https://learn.microsoft.com/fr-fr/dotnet/standard/base-types/stringbuilder
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
