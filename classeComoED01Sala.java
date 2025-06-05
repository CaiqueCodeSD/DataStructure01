/* Busca por nome / Busca por codigo / ordena por nome / ordena por codigo */

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

   String nome;
   int cod;

   Disciplina[] V = new Disciplina[5];

      public static void buscarNome(String nome) {

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