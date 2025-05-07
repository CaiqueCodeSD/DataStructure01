/* Um professor precisa registrar as notas dos trabalhos de 2 grupos em 2 turmas. 
Para isso, ele pensou em armazenar a matrícula e o nome dos componentes, as notas do trabalho escrito e 
da apresentação, e de cada Grupo, armazenar o número, o tema do trabalho, os dados de 3 componentes e as notas do Grupo. 
Crie uma classe para alunos, outra para notas, e uma terceira para o Grupo. 
Crie uma matriz [2][2] de grupos, onde as linhas farão o controle das turmas e as colunas controlam os grupos.
Receba os dados e ao final, apresente os dados na tela, separando turmas e informações de cada Grupo. */

import java.util.Scanner;

class Alunos {

    String matricula;
    String componentes;

    public Alunos(String matricula, String componentes) {
        this.matricula = matricula;
        this.componentes = componentes;
    }

}

class Notas {

    double notaEscrito;
    double notaApresentacao;
    
    public Notas(double notaEscrito, double notaApresentacao) {
        this.notaEscrito = notaEscrito;
        this.notaApresentacao = notaApresentacao;
    }

}

class Grupo {

    int numero;
    String tema;
    Alunos[] alunos = new Alunos[3];
    Notas notas;

    public Grupo(int numero, String tema, Alunos[] alunos, Notas notas) {
        this.numero = numero;
        this.tema = tema;
        this.alunos = alunos;
        this.notas = notas;
    }

    public void mostrarGrupos() {

        System.out.println("Grupo nº " + numero);
        System.out.println("Tema: " + tema);
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i].componentes + " | Matrícula: " + alunos[i].matricula);
        }
        System.out.println("Nota escrita: " + notas.notaEscrito);
        System.out.println("Nota apresentação: " + notas.notaApresentacao);
        System.out.println("-----------------------------");
    
    }

}

public class VetorMatriz08 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Grupo[][] grupos = new Grupo[2][2];
        
        for (int turma = 0; turma < 2;turma++) {
            for (int grupo = 0; grupo < 2; grupo++) {
                System.out.println("TURMA " + (turma + 1) + " GRUPO " + (grupo + 1));
                System.out.print("Número do grupo: ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tema: ");
                String tema = scanner.nextLine();

                Alunos[] alunos = new Alunos[3];
                for (int i = 0; i < alunos.length; i++) {
                    System.out.print("Nome do aluno " + (i + 1) + ": ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula do aluno " + (i + 1) + ": ");
                    String matricula = scanner.nextLine();
                    alunos[i] = new Alunos(matricula, nome);                
                }
                System.out.print("Nota do trabalho escrito: ");
                double notaEscrito = scanner.nextDouble();
                System.out.print("Nota da apresentação: ");
                double notaApresentacao = scanner.nextDouble();
                scanner.nextLine();

                Notas notas = new Notas(notaEscrito, notaApresentacao);
                grupos[turma][grupo] = new Grupo(numero, tema, alunos, notas);
            }
        }

        System.out.println("Resultados");

        for (int i = 0; i < 2; i++) {
            System.out.println("Turma: " + (i + 1));
            for (int j = 0; j < 2; j++) {
                grupos[i][j].mostrarGrupos();
                //i = turmas
                //j = grupos
            }
        }

    }

}

