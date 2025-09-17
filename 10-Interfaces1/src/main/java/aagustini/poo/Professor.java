package aagustini.poo;

public class Professor implements Salario {
    private String nome;
    private int matricula;
    private int cargaHoraria;
    private float valorHora;

    public Professor(String n, int m, int c, float v) {
        nome = n; matricula = m; cargaHoraria = c; valorHora = v; }

    public void setNome(String n) { nome = n; }
    public String getNome() { return(nome); }
    public void setMatricula(int m) { matricula = m; }

    public float getSalarioLiquido() {
        float salBruto = valorHora*cargaHoraria*(float)4.5;
        return ( salBruto - (salBruto*(float)0.08) );
    }

    public float getQuantidadeSalariosMinimo() {
        return ( getSalarioLiquido() / SALARIO_MINIMO );
    }

    @Override
    public String toString() {
       return "Prof. " + nome;
    }

    @Override
    public String whoAmi() {   
        return toString();
    }

}
