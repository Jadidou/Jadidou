
public class tri_SSS {
    public static void main(String[] args) {

        int tab[] = {7, 8, 3, 1, 2};

        for (int i = 0; i < tab.length - 1; i++){
            int small = i;
            for(int j = i+1; j < tab.length; j++){
                if(tab[small] > tab[j]){
                    small = j;
                }
            }
            int tmp = tab[small];
            tab[small] = tab[i];
            tab[i] = tmp;
        }
        printArray(tab);
    }
    private static void printArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){ //fait en sorte dafficher les nombres sur la console
            System.out.println(numbers[i]);
        }
    }
}
