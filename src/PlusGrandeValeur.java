public class PlusGrandeValeur {
    public static void main(String[] args) throws Exception {
        TableauArray tab1 = new TableauArray(15);//Creation de l objet Tab1

        tab1.clasrand(0, 100); // Remplir le tableau avec des valeurs entre 0 et 100

        int valumax = tab1.trie(); //Trie retourn maximun et ca sera stocket dans valumax
       
        System.out.println(valumax);

    }
}
