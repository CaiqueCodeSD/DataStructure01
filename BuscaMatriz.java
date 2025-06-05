import java.util.Random;
import java.util.Scanner;

public class BuscaMatriz {

    public static void main(String[] args) {
        
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[][] M = new int[2][2];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = rd.nextInt(10);
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Qual o valor para procurar? ");
        int x = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] == x) {
                    System.out.println("Valor encontrado na pos " + i + " | " + j);
                    encontrou = true;
                    break;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Não encontrado");
        }


    }

}
