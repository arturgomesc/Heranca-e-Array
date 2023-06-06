package Questao3;

import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        final int LIM = 4;
        Aluno aluno[] = new Aluno[LIM];

        for(int i = 0; i < aluno.length; i++){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o Nome do aluno: ");
            String nome = ler.nextLine();

            Aluno x = new Aluno(i+1, nome);
            aluno[i] = x;
        }

        for(int i = 0; i < aluno.length; i++){
            if (aluno[i] != null){
                System.out.println("Aluno: "+aluno[i].getNome() + " - "+ "Matrícula: "+aluno[i].getNumeroMatricula());
            }
        }
    }
}
