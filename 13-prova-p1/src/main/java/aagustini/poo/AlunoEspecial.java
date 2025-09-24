package aagustini.poo;

public class AlunoEspecial extends Aluno {

 
    public AlunoEspecial(String nome, double n1, double n2) {
        super(nome, n1, n2);

    }
    


    @Override
    public double calculaNotaFinal() {
        return (2*getN1() + 3*getN2())/5;
    }

    @Override
    public String toString() {
        return String.format("Aluno Pós - %s", 
                              super.toString());
    }
}