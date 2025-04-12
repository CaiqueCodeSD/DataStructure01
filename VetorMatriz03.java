//criar matriz 3x3 - exibir diagonais

import java.util.Random;

public class VetorMatriz03 {

    public static void main(String[] args) {

        Random rand = new Random();
        
        int[][] M1 = new int[3][3];

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                M1[i][j] = rand.nextInt(10001);
                System.out.print(M1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //primaria
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                if (i == j) {
                    System.out.print(M1[i][j] + "\t");
                }
            }
        }

        System.out.println();

        //secundaria
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                if (i + j == 2) {
                    System.out.print(M1[i][j] + "\t");
                }
            }
        }

    }

}