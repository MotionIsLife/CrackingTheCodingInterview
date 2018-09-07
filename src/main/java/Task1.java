import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 7;
        Random random = new Random();
        int[][] mas = new int[size][size];
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mas[i][j] = random.nextInt(51) - 30;
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        int max = mas[0][0];
        int barrier = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j <= barrier) {
                    if(mas[i][j] > max) {
                        max = mas[i][j];
                    }

                }
            }
            --barrier;
        }
        System.out.println("max = " + max);
    }
}
