package aagustini.poo;

public class AlunoPos extends Aluno {

 
    public AlunoPos(String nome, double n1, double n2) {
        super(nome, n1, n2);

    }
    


    @Override
    public double calculaNotaFinal() {
        return (getN1()>getN2())?getN1():getN2();
    }

    @Override
    public String toString() {
        return String.format("Aluno Pós - %s", 
                              super.toString());
    }
    
}

