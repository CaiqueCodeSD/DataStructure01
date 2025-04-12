//criar matriz 3x3 - exibir diagonais

import java.util.Random;

public class VetorMatriz04 {

    public static void main(String[] args) {

        Random rand = new Random();
        
        int[][] M1 = new int[3][3];

        int maior = 0;
        int posL = 0;
        int posC = 0;

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                M1[i][j] = rand.nextInt(10001);
                System.out.print(M1[i][j] + "\t");

                if (M1[i][j] > maior) {
                    maior = M1[i][j];
                    posL = i;
                    posC = j;
                }

            }
            System.out.println();
        }

        System.out.println(maior + "/" + posL + "/" + posC);

    }

}