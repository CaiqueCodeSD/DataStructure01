/*Construa uma classe para armazenar informações de Livros para uma biblioteca
Os dados são: (i)codigo   (ii)Título   (iii)Autor  (iv)quantidade de exemplares
Escreva métodos para (a) criar o vetor  (b) ler dados  (c ) Editar dados a partir da busca por codigo  (d) mostrar dados  (e)mostrar ordenado por título 
 */
import java.util.Scanner;

class Biblioteca {

    int codigo;
    String titulo;
    String autor;
    int qtdExemplares;

    public biblioteca (int codigo, String titulo, String autor, int qtdExemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.qtdExemplares = qtdExemplares;
    }

}

public class classeComoED02 {

    public static Scanner sc = new Scanner(System.in);

    public static void criarVetor(Biblioteca V[], int tam) {
        System.out.print("Qual será o tamanho do vetor? ");
        tam = sc.nextInt();
        V = new Biblioteca[tam];
    }

    public static void lerVetor(Biblioteca V[], int codigo, String titulo, String autor, int qtdExemplares) {
        System.out.print("Qual o título do livro? ");
        titulo = sc.nextLine();
    }

    public static void main(String[] args) {
        
        criarVetor(null, 0);

    }

}
