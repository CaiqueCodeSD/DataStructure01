/*Um professor precisa registrar os dados dos trabalhos em groupIndex realizados por duas turmas diferentes. Cada turma possui dois grupos de trabalho, e cada groupIndex é composto por 3 alunos.

Para cada groupIndex, o professor deseja armazenar as seguintes informações:
Número do groupIndex
Tema do trabalho

Três alunos, contendo:
Nome
Matrícula

Notas do groupIndex, contendo:
Nota do trabalho escrito
Nota da apresentação

✅ Requisitos:
Crie uma classe Aluno com os atributos:
nome (String)
matricula (String)

Crie uma classe Nota com os atributos:
notaEscrita (double)
notaApresentacao (double)

Crie uma classe Grupo com os atributos:
numero (int)
tema (String)

Um vetor de 3 alunos (Aluno[])

Um objeto da classe Nota

Crie na função principal (main) uma matriz 2x2 de objetos Grupo, onde:

As linhas representam as turmas (2 turmas)

As colunas representam os grupos de cada turma (2 grupos por turma)

Solicite ao usuário que informe os dados para todos os grupos.

Ao final, imprima os dados organizados por turma e por groupIndex. */

import java.util.Scanner;

class Aluno {
    String nome;
    String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }   
}

class Nota {
    double notaEscrita;
    double notaApresentacao;

    public Nota(double notaEscrita, double notaApresentacao) {
        this.notaEscrita = notaEscrita;
        this.notaApresentacao = notaApresentacao;
    }
}

class Grupo {
    int numero;
    String tema;
    Aluno[] aluno = new Aluno[2];
    Nota nota;

    public Grupo(int numero, String tema, Aluno[] aluno, Nota nota) {
        this.numero = numero;
        this.tema = tema;
        this.aluno = aluno;
        this.nota = nota;
    }

    public void mostrarGrupos() {

        System.out.println("Grupo nº " + numero);
        System.out.println("Tema: " + tema);
        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Aluno: " + aluno[i].nome + " | Matrícula: " + aluno[i].matricula);
        }
        System.out.println("Nota escrita: " + nota.notaEscrita);
        System.out.println("Nota apresentação: " + nota.notaApresentacao);
        System.out.println("-----------------------------");
    
    }
    
}

public class VetorMatriz08review {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Grupo[][] grupos = new Grupo[2][2];

        for (int turmas = 0; turmas < 2; turmas++) {
            for (int groupIndex = 0; groupIndex < 2; groupIndex++) {
                System.out.println("TURMA " + (turmas + 1) + " --- GRUPO " + (groupIndex + 1));
                System.out.print("Número do grupo: ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tema do Grupo " + (groupIndex + 1) + ": ");
                String tema = scanner.nextLine();

                Aluno[] alunos = new Aluno[2];
                for (int i = 0; i < alunos.length; i++) {
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    alunos[i] = new Aluno(matricula, nome);
                }
                System.out.print("Nota do trabalho escrito: ");
                double notaEscrita = scanner.nextDouble();
                System.out.print("Nota da apresentação: ");
                double notaApresentacao = scanner.nextDouble();
                scanner.nextLine();

                Nota notas = new Nota(notaEscrita, notaApresentacao);
                grupos[turmas][groupIndex] = new Grupo(numero, tema, alunos, notas);
            }
        }

        System.out.println("Resultados: ");

        for (int i = 0; i < grupos.length; i++) {
            System.out.println("Turma: " + (i + 1));
            for (int j = 0; j < 2; j++) {
                grupos[i][j].mostrarGrupos();
                //i = turmas
                //j = grupos
            }
        }

    }

}

