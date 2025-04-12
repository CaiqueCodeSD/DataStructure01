//ler 10 int positivo, no segundo vetor indice par recebe os elementos divididos por 2, impares recebem o valor multiplicado por 3.

import java.util.Scanner;

public class VetorMatriz02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] V1 = new int[10];
        int[] V2 = new int[10];
        
        for (int i = 0; i < V1.length; i++) {
            System.out.print("Insira o número na pos[" + i + "]: ");
            V1[i] = scanner.nextInt();

            while (V1[i] <= 0) {
                System.out.print("Insira o número POSITIVO na pos[" + i + "]: ");
                V1[i] = scanner.nextInt();
            }

            if (i % 2 == 0) {
                V2[i] = V1[i] / 2;
            } else {
                V2[i] = V1[i] * 3;
            }

        }

        for (int i = 0; i < V1.length; i++) {
            System.out.print(V1[i] + "\t");
        }

        System.out.println("\t");

        for (int i = 0; i < V2.length; i++) {
            System.out.print(V2[i] + "\t");
        }

    }

}
