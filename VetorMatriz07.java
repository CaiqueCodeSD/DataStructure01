import java.util.Scanner;

class pessoa {
    String nome, CPF;

    pessoa(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }
}

public class VetorMatriz07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        pessoa[] V1 = new pessoa[5];
        String nome, CPF;

        for (int i = 0; i < V1.length; i++) {
            System.out.print("Insira o nome: ");
            nome = scanner.nextLine().trim(); // remove espaços extras
            System.out.print("Insira o CPF: ");
            CPF = scanner.nextLine().trim();
            V1[i] = new pessoa(nome, CPF);

            // Debug
            System.out.println("Cadastrado: " + V1[i].nome + " - " + V1[i].CPF);
        }

        System.out.print("Checar o CPF: ");
        String checar = scanner.nextLine().trim(); // remove espaços extras

        // Debug
        System.out.println("Checando CPF: " + checar);

        boolean encontrado = false;
        for (int i = 0; i < V1.length; i++) {
            if (checar.equals(V1[i].CPF)) {
                System.out.println("Tem cadastro");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("CPF não encontrado.");
        }

        scanner.close();
    }
}
