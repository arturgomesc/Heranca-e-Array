package Questao3;

public class Aluno {
    private int numeroMatricula;
    private String nome;

    public Aluno(int numeroMatricula, String nome) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void listar(Aluno aluno[]) {
        for (int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[1]);
        }
    }
}
