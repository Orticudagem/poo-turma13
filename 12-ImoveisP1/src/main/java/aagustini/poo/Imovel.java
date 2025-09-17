package aagustini.poo;

public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private Geo geoLocalizacao;

    private static double VR;

    public static void setVR(double valor) {
        VR = valor;
    }

    public static double getVR() {
        return VR;
    }

    public Imovel(String propr, int area, Geo geoLoc) {
        this.proprietario = propr;
        this.areaConstruida = area;
        this.geoLocalizacao = geoLoc;
    }

    public int getAreaConstruida(){
        return areaConstruida;
    }

    public String getProprietario(){
        return proprietario;
    }

    public abstract double calculaImposto();

    public String toString() {
        return String.format("Proprietario: %s  Imposto: R$ %.2f",
                                this.proprietario,
                                this.calculaImposto());

    }
}
