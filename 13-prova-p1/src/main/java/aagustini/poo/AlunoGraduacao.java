package aagustini.poo;

public class AlunoGraduacao extends Aluno {

    private final int matricula;

    private static int proxNumeroMatricula = 1000;

    public AlunoGraduacao(String nome, double n1, double n2) {
        super(nome, n1, n2);
        proxNumeroMatricula++;
        matricula = proxNumeroMatricula;
    }
    
    public static int getProxNumMatricula() {
        return proxNumeroMatricula;
    }

    @Override
    public double calculaNotaFinal() {
        return (getN1() + getN2())/2;
    }

    @Override
    public String toString() {
        return String.format("AluGrad Matr: %d  - %s", 
                             matricula, super.toString());
    }
    
}
