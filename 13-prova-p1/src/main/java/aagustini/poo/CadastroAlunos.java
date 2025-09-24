package aagustini.poo;

import java.util.ArrayList;

public class CadastroAlunos {
    // cadastro é de alunos e por polimorfismo podemos 
    // inserir na lista alunos de Graduação, Pós ou especiais
    ArrayList<Aluno> alunos;

    public CadastroAlunos() {
        alunos = new ArrayList<>();
    }

    public void inserir(Aluno aluno) {
        alunos.add(aluno);
    }

    public String aprovados() {
        StringBuilder sb = new StringBuilder("Alunos Aprovados\n");
        for (Aluno alu : alunos) {
            if (alu.situacaoAluno() == SituacaoAluno.APROVADO) {
                sb.append(alu.getNome());
                sb.append("\t");
                sb.append( alu.calculaNotaFinal());
                sb.append("\n");
            }
        }
            return sb.toString();
    }

    public double graduacaoAprovados() {
        int countGrad = 0;
        int countAprovGrad = 0;
        for (Aluno alu : alunos) {
            if ( alu instanceof AlunoGraduacao ) {
                countGrad++;
                if (alu.situacaoAluno() == SituacaoAluno.APROVADO)
                    countAprovGrad++;
            }
        }
        // dará erro se não tiver alunos de graduacao
        return (double) countAprovGrad / countGrad;
    }

    public Aluno find(String nome) {
        for (Aluno alu : alunos) 
            if (alu.getNome().equals(nome))
                return alu;
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cadastro de alunos\n");
        for (Aluno alu : alunos) {
            sb.append(alu.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
