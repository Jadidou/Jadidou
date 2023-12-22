
public class tri_fouille_s {
    public static void main(String[] args) {

        int tab[] = {99, 16, 37, 28, 47};
        System.out.println(fouille(tab, 16));
    }
    public static int fouille(int tab[], int element){
        /**
        for (int i = 0; i < tab.length; i++) { //fait en sorte dafficher les nombres sur la console
            System.out.println(tab[i]);
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] == i) {
                        return j;
                }
            }
        }
        return-1;
         */
        int i = 0;
        boolean trouve = false;

        while(!trouve && i < tab.length){
            if(element == tab[i]){
                trouve = true;
            }
            else{
                i++;
            }
        }
        return trouve ? i : -1;
    }

}
