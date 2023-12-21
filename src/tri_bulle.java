import java.util.Random;
public class tri_bulle {
    public static void main(String[] args) {

        Random r = new Random();
        int[] numberRandom = new int[10]; //tableau longeur de 10

        for (int i = 0; i < numberRandom.length; i++){
            numberRandom[i] = r.nextInt(1000000); //place des nbr random entre 1 et 1000000
        }
        System.out.println("Before"); //print before et met la liste mélanger
        printArray(numberRandom);

        //sorting algorithm here
        boolean swappedSomething = true; //il faut commencer vrai pour l faire fonctionner

        while(swappedSomething) { //y faut faire une boucle pour regarder touts les chiffres

            swappedSomething = false; //si c faux il y a la fonction for pour qu'il regarde le prochain

            for (int i = 0; i < numberRandom.length - 1; i++) {
                if (numberRandom[i] > numberRandom[i + 1]) {
                    swappedSomething = true; // si c'est vrai il va donc activer le if pour échanger les deux nbr
                    int temp = numberRandom[i];
                    numberRandom[i] = numberRandom[i + 1]; //les trois ici sont pour tout les comparer
                    numberRandom[i + 1] = temp;
                }
            }
        }

        System.out.println("After"); //print before et la liste en ordre car le tri bulle est juste au dessus
        printArray(numberRandom);
    }

    private static void printArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){ //fait en sorte dafficher les nombres sur la console
            System.out.println(numbers[i]);
        }
    }
}
