/*Construa uma classe para armazenar informações de Livros para uma biblioteca
Os dados são: (i)codigo   (ii)Título   (iii)Autor  (iv)quantidade de exemplares
Escreva métodos para (a) criar o vetor  (b) ler dados  (c ) Editar dados a partir da busca por codigo  (d) mostrar dados  (e)mostrar ordenado por título 
 */
import java.util.Scanner;

//essa classe cuida individualmente de cada livro
class Livro {

    String codigo;
    String titulo;
    String autor;
    int qtdExemplares;

    public Livro (String codigo, String titulo, String autor, int qtdExemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.qtdExemplares = qtdExemplares;
    }

}

public class classeComoED02 {   

    public static Livro[] livros;
    static Scanner sc = new Scanner(System.in);

    //método para inicializar e definir o tamanho do vetor
    public static void criarVetor(Livro V[], int tam) {
        System.out.print("Qual será o tamanho do vetor? ");
        tam = sc.nextInt();
        sc.nextLine();
        livros = new Livro[tam];
    }

    //método para inserir os dados do vetor
    public static void lerVetor(Livro V[], int tam, String codigo, String titulo, String autor, int qtdExemplares) {

        for (int i = 0; i < V.length; i++) {
            System.out.print("Qual o título do livro? ");
            titulo = sc.nextLine();
            System.out.print("Qual nome do autor? ");
            autor = sc.nextLine();
            System.out.print("Qual o código do livro? ");
            codigo = sc.next();
            System.out.print("Quantos estão disponíveis? ");
            qtdExemplares = sc.nextInt();
            sc.nextLine();
            System.out.print("---" + "\n");
            V[i] = new Livro(codigo, titulo, autor, qtdExemplares);
        }
        
    }

    //método para selecionar um código e editar as informações presentes nele
    public static void editarPorCodigo (Livro V[], String cod, String codigo, String titulo, String autor, int qtdExemplares) {

        System.out.print("Insira o código do livro para realizar alterações: ");
        cod = sc.next();

        boolean achou = false;

        for (int i = 0; i < V.length; i++) {
            if (cod.equalsIgnoreCase(V[i].codigo)) {
                System.out.println("Realizando alterações...");
                System.out.print("Qual o título do livro? ");
                titulo = sc.next().toUpperCase();
                System.out.print("Qual nome do autor? ");
                autor = sc.next().toUpperCase();
                System.out.println("Código: " + V[i].codigo);
                codigo = V[i].codigo.toUpperCase();
                System.out.print("Quantos estão disponíveis? ");
                qtdExemplares = sc.nextInt();
                V[i] = new Livro(codigo, titulo, autor, qtdExemplares);
                System.out.println("Alterações salvas! ");
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Código inexistente na biblioteca!");
        }

    }
    
    //método para imprimir os dados
    public static void mostrarDados(Livro V[], int tam, String codigo, String titulo, String autor, int qtdExemplares) {

        System.out.println("EXIBINDO A BIBLIOTECA");

        for (int i = 0; i < V.length; i++) {
            System.out.println(V[i].titulo); 
            System.out.println(V[i].autor); 
            System.out.println(V[i].codigo); 
            System.out.println(V[i].qtdExemplares); 
            System.out.println("---------------");
       }

    }

    //método para ordenar por título e deixar os dados agrupados na devida posição
    public static void ordenarPorTitulo(Livro V[], int tam, String codigo, String titulo, String autor, int qtdExemplares) {
        System.out.println("BIBLIOTECA ORDENADA POR TÍTULOS");
        for (int i = 0; i < V.length - 1; i++) {
            for (int j = i + 1; j < V.length; j++) {
                if (V[i].titulo.compareToIgnoreCase(V[j].titulo) > 0) {
                    Livro temp = V[i];
                    V[i] = V[j];
                    V[j] = temp;
                }
            }
        }
        mostrarDados(V, tam, codigo, titulo, autor, qtdExemplares);
    }

    //rodando os métodos
    public static void main(String[] args) {
        
        criarVetor(null, 0);
        lerVetor(livros, 0, null, null, null, 0);
        //mostrarDados(livros, 0, null, null, null, 0);
        editarPorCodigo(livros, null, null, null, null, 0);
        mostrarDados(livros, 0, null, null, null, 0);
        ordenarPorTitulo(livros, 0, null, null, null, 0);

    }

}
