public class ordenacao01 {

    public static void main(String[] args) {
        String palavra = "ChicoMelancias";

        char[] ordenar = palavra.toLowerCase().toCharArray();
        int n = ordenar.length;

        for (int i = 0; i < ordenar.length - 1; i++) {
            for (int j = i + 1; j < ordenar.length; j++) {
                if (ordenar[i] > ordenar[j]) {
                    char aux = ordenar[i];
                    ordenar[i] = ordenar[j];
                    ordenar[j] = aux;
                }
            }
        }

        String ordenada = new String(ordenar);
        System.out.println(ordenada);

    }
}
