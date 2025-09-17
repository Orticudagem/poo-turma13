package aagustini.poo;

public interface Salario
{
    public static final float SALARIO_MINIMO = 2000;
    public abstract float getSalarioLiquido();
    public abstract float getQuantidadeSalariosMinimo();
    public abstract String whoAmi();
}
