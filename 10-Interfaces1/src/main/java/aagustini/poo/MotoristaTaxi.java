package aagustini.poo;


public class MotoristaTaxi implements Salario {
    private String nome;
    private int cpf, numCarteira;
    private String dataExpiracao;
    private int numeroTaxi;
    private float totalKmRodados, valorKm;

    public MotoristaTaxi(String umNome, int umCPF, int umNroCart, String umaVal,
                         int umNroTaxi, float qtdKm, float valKm) {
            nome = umNome;
            cpf = umCPF;
            numCarteira = umNroCart;
            dataExpiracao = umaVal;
            numeroTaxi = umNroTaxi;
            totalKmRodados = qtdKm ;
            valorKm = valKm;
    }

    public String getNome() { return nome; }
    public float getTotalKmRodados() { return totalKmRodados; }
    public float valorKm() { return valorKm; }

    public float getSalarioLiquido() {
        float salBruto = totalKmRodados * valorKm;
        return ( salBruto - (salBruto*(float)0.05) );
    }

    public float getQuantidadeSalariosMinimo() {
        return ( getSalarioLiquido() / SALARIO_MINIMO );
    }

    @Override
    public String toString() {
        return "MotTaxi: " + nome;
    }

    @Override
    public String whoAmi() {       
        return toString();
    }

}
