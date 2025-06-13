import java.util.Scanner;

class Pratos {
    String id;
    String nome;
    double valor;
    boolean disponivel;

    public Pratos(String id, String nome, double valor, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
    }
}

public class restauranteEstudando {

    static Scanner sc = new Scanner(System.in);

    public static Pratos[] MenuRestaurante() {
        System.out.print("Capacidade máxima para armazenar os pratos: ");
        int x = sc.nextInt();
        Pratos[] V = new Pratos[x];

        for (int i = 0; i < V.length; i++) {
            System.out.print("NOME DO PRATO: ");
            String nome = sc.next().toUpperCase();
            System.out.print("ID DO PRATO: ");
            String id = sc.next();
            System.out.print("VALOR DO PRATO: ");
            double valor = sc.nextDouble();
            System.out.print("DISPONIBILIDADE NO CARDÁPIO (true/false): ");
            boolean disponivel = sc.nextBoolean();

            V[i] = new Pratos(id, nome, valor, disponivel);
        }

        return V;
    }

    public static void editarPorCodigo(Pratos[] V) {
        sc.nextLine(); // Limpa o buffer
        System.out.print("QUAL O ID DO PRATO QUE DESEJA EDITAR? ");
        String x = sc.nextLine();
        boolean encontrou = false;

        for (int i = 0; i < V.length; i++) {
            if (x.equalsIgnoreCase(V[i].id)) {
                System.out.print("NOVO NOME DO PRATO: ");
                String nome = sc.next().toUpperCase();
                System.out.print("NOVO VALOR DO PRATO: ");
                double valor = sc.nextDouble();
                System.out.print("DISPONIBILIDADE NO CARDÁPIO (true/false): ");
                boolean disponivel = sc.nextBoolean();

                V[i] = new Pratos(V[i].id, nome, valor, disponivel);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("ID não encontrado.");
        }
    }

    public static void main(String[] args) {
        Pratos[] vetorPratos = MenuRestaurante();
        editarPorCodigo(vetorPratos);
    }
}
