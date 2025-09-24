package aagustini.poo;

// classe abstrata - não pode ser instanciada
public abstract class Aluno {
    private String nome;
    private double n1;
    private double n2;

    public Aluno(String nome, double n1, double n2) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
        this.n1 = n1; this.n2 = n2;
    }

    public String getNome() { return nome; }
    public double getN1() { return n1; }
    public double getN2() { return n2; }

    // método abstrato - todas subclasses devem implementar
    public abstract double calculaNotaFinal();

    public SituacaoAluno situacaoAluno(){
        if (calculaNotaFinal() >= 7.0){
            return SituacaoAluno.APROVADO;
        }else{
            return SituacaoAluno.REPROVADO;
        }
    }

    // estou sobrescrevendo o método toString
    @Override
    public String toString() {
        //return "Aluno: " + getNome();
        return String.format("Nome: %s Nota final: %.2f Situação: %s",
                        getNome(), calculaNotaFinal(), situacaoAluno());
    }
}
