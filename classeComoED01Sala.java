/* Busca por nome / Busca por codigo / ordena por nome / ordena por codigo */

import java.util.Scanner;

class Disciplina {

   String nome;
   int cod;

   Disciplina (String nome, int cod) {
      this.nome = nome;
      this.cod = cod
   }

}

public class classeComoED01Sala {

   public static void main (String[] args) {

   Scanner sc = new Scanner(System.in);

   String nome;
   int cod;

   Disciplina[] V = new Disciplina[5];

   for (int i = 0; i < V.length; i++) {
      sout("Nome: ");
      nome = sc.nextLine();
      sout("Cod: ");
      cod = sc.nextInt();
      sc.nextLine();
   }

      public static void buscarNome(String nome, Disciplina V[]) {

         boolean encontrou = false;

         for (int i = 0; i < V.length; i++) {
            if (V[i].nome.toLowerCase(); == nome.toLowerCase()) {
               sout("Nome encontrado ");
               encontrou = true;
            }
         }

         if (!encontrou) {
            sout("Nome não encontrado)";
         }
      }

   }

}