//ler 2 vetores de 10 inteiros e criar um vetor com a união de ambos.

import java.util.Scanner;
import java.util.Random;

public class VetorMatriz05 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] V1 = new int[10];
        int[] V2= new int[10];
        int[] V3 = new int[V1.length * 2];

        for (int i = 0; i < V3.length; i++) {
            if (i < 10) {
                V1[i] = rand.nextInt(1001);
                V3[i] = V1[i];
            } else {
                int aux = 10;
                V2[i - aux] = rand.nextInt(1001);
                V3[i] = V2[i - aux];
            }

            System.out.print(V3[i] + "\t");

        }

    }

}