/*Construa uma classe para armazenar informações de Pratos para um restaurante.

Os dados a serem armazenados para cada prato são:

(i) Código: Um identificador único para o prato (ex: "PRATO001", "VEGAN05").
(ii) Nome: O nome completo do prato (ex: "Lasanha à Bolonhesa", "Salmão Grelhado com Legumes").
(iii) Preço: O valor monetário do prato (ex: 45.90, 72.50).
(iv) Disponível no Menu: Um indicador booleano (true se estiver disponível, false se não estiver).
Escreva métodos para a classe principal que gerencia o menu do restaurante (MenuRestaurante, por exemplo) para realizar as seguintes operações:

(a) Criar o vetor (array) de pratos: Perguntar ao usuário qual será a capacidade máxima de pratos que o menu poderá armazenar.
(b) Adicionar um novo prato: Ler os dados de um novo prato (código, nome, preço, disponibilidade) e inseri-lo no vetor. Inclua validação para garantir que o código seja único e que o preço seja um valor positivo.
(c) Editar dados de um prato: Buscar um prato a partir do seu código e permitir que o usuário altere o nome, preço e/ou disponibilidade.
(d) Mostrar todos os pratos: Exibir as informações completas de todos os pratos cadastrados no menu.
(e) Mostrar pratos ordenados por preço: Exibir as informações dos pratos, mas ordenados do mais barato para o mais caro, utilizando o algoritmo Bubble Sort */

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
