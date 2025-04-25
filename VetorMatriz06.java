//receber 6 inteiros e mostrar os números pares / a soma dos pares / os ímpares / quantidade dos ímpares

public class VetorMatriz06 {
    
    public static void main(String[] args) {
        
        int[] V1 = {2,23,54,57,98,95};
        int soma = 0; 
        int qtdImpares = 0; 
        
        for (int i = 0; i < V1.length; i++) {
            
            if (V1[i] % 2 == 0) {
                System.out.println(V1[i]);
                soma += V1[i];
            }

        }

        System.out.println("Soma dos pares: " + soma);

        for (int i = 0; i < V1.length; i++) {
            
            if (V1[i] % 2 != 0) {
                System.out.println(V1[i]);
                qtdImpares++;
            }

        }

        System.out.println("Quantidade ímpares: " + qtdImpares);

    }

}
