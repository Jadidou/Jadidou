import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean fruit;

        System.out.print("Est ce que la tomate est un fruit (true or false): ");
        fruit = scan.nextBoolean();

        if (fruit == true){
            System.out.println("Bravo");
            System.out.println();
            System.out.println("  *  ");
            System.out.println(" ***");
            System.out.println("*****");
            System.out.println("  *");
            System.out.println("  *");
        }
        else{
            System.out.println("MAUVAISE RÉPONSE");
        }
    }
}