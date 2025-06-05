//ler x posições / criar bloco que armazena nome e idade / método para imprimir conteúdo em sequência contrária

import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
    Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class provaMINE01 {

    public static void contrario(Pessoa bloco[]) {
        for (int i = bloco.length - 1; i >= 0; i--) {
            System.out.println("Nome: " + bloco[i].nome + " | Idade: " + bloco[i].idade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Tamanho do bloco: ");
        int x = sc.nextInt();
        sc.nextLine();

        Pessoa[] bloco = new Pessoa[x];

        for (int i = 0; i < bloco.length; i++) {
            System.out.print("Nome da pessoa: ");
            nome = sc.nextLine();
            System.out.print("Idade da pessoa: ");
            idade = sc.nextInt();
            sc.nextLine();
            bloco[i] = new Pessoa(nome, idade);
        }

        System.out.println();
        contrario(bloco);

        }

}
