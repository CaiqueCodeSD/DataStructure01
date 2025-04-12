//ler 10 int e guardar no vetor, imprimir nos dois sentidos

import java.util.Scanner;

public class VetorMatriz01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o número na pos[" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }

        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + "\t");
        }

    }
    
}