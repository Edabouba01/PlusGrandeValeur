import java.util.ArrayList;
import java.util.Random;

public class TableauArray 
{

   
    private ArrayList<Integer> tab;
    
    //creation d un constructeur personnaliser

    public TableauArray(int tailletab){
        this.tab= new ArrayList<>();
    }

    // creation de la classe de la fonction rondom pour le remplissage aleatoire

    public void clasrand(int min, int max){
        Random rand = new Random();// donne des valeur aleatoire
        for (int i = 0; i < 15;i++) {
            tab.add(rand.nextInt(max - min + 1) + min); // Valeurs entre 0 et 100 inclus
        }
    }

        //Pour avoire le max
        public int trie(){
            int maximun = tab.get(0);//creation dune variable dit maximum initialiser avec tab[0]

            // la condition est simple pour i=0 jusqua la taille du tableau 15,si tab[i] est > a la valeur notre variable maximum ( initialiser a tab[0]) il prend la valeur de la plus grande valeur stocker dans le tableau dont maximum contiendra alors le meximum
            for (int i = 0; i < 15;i++) {
                if(tab.get(i)>maximun){maximun = tab.get(i);}
            }
            // lorsquon appelle la fonction trie il retournera automatiquement le maximum
        return maximun;
        
        }

         // Méthode pour trouver l'index de la plus grande valeur
    public int numerocase() {
        return tab.indexOf(trie());
    }

      public void Afficher(){
        System.out.println();
      }
       
}

