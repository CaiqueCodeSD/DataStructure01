/* Busca por nome / Busca por codigo / ordena por nome / ordena por codigo */

import java.util.Scanner;

class Disciplina {

   String nome;
   int cod;

   Disciplina (String nome, int cod) {
      this.nome = nome;
      this.cod = cod;
   }

}

public class ClasseComoED01Sala {

   //método para buscar nome
   public static void buscarNome(String nome, Disciplina V[]) {

      boolean encontrou = false;

      for (int i = 0; i < V.length; i++) {
         if (V[i].nome.equalsIgnoreCase(nome)) {
            System.out.println("\n" + "Nome encontrado!" + "\n");
            encontrou = true;
         }
      }

      if (!encontrou) {
         System.out.println("\n" + "Não encontrado" + "\n");
      }
   }

   //método para buscar código
   public static void buscarCod (Disciplina V[], int c) {
      for (int i = 0; i < V.length; i++) {
         if (V[i].cod == c) {
            System.out.println("\n" + "Achou!" + "\n");
         }
      }
   }

   //método para ordenar por nome
   public static void ordenarNomes (Disciplina V[], String nome) {

      System.out.println("--- Nomes ordenados: ---");

      for (int i = 0; i < V.length - 1; i++) {
         for (int j = i + 1; j < V.length; j++) {
            if (V[i].nome.compareToIgnoreCase(V[j].nome) > 0) {
               Disciplina temp = V[i];
               V[i] = V[j];
               V[j] = temp;
            }
         }
        
      }
      for (int i = 0; i < V.length; i++) {
         System.out.println(V[i].nome);
      }
   }

   //método para ordenar por codigo
   public static void ordenarCodigos (Disciplina V[], int cod) {

      System.out.println("--- Códigos ordenados: ---");

      for (int i = 0; i < V.length - 1; i++) {
         for (int j = i + 1; j < V.length; j++) {
            if (V[i].cod > V[j].cod) {
               Disciplina temp = V[i];
               V[i] = V[j];
               V[j] = temp;
            }
         }
      }
      
      for (int i = 0; i < V.length; i++) {
         System.out.println(V[i].cod);
      }

   }


   public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int cod;

        Disciplina[] V = new Disciplina[5];

        for (int i = 0; i < V.length; i++) {
            System.out.print("Insira o nome: ");
            nome = sc.nextLine();
            System.out.print("Informe o código: ");
            cod = sc.nextInt();
            sc.nextLine();
            V[i] = new Disciplina(nome, cod);
        }

        System.out.println("--- Qual nome deseja buscar? ---");
        nome = sc.nextLine();
        buscarNome(nome, V);

        System.out.println("--- Qual código está buscando? ---");
        cod = sc.nextInt();
        buscarCod(V, cod);

        ordenarNomes(V, nome);
        ordenarCodigos(V, cod);

   }

}
