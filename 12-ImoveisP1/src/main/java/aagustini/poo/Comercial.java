package aagustini.poo;

public class Comercial extends Imovel {
    
    public Comercial(String propr, int area, 
                            Geo geoLoc) {
            super(propr, area, geoLoc);
    }

    @Override
    public double calculaImposto() {
        return 300;
    }

    @Override
    public String toString() {
        return "Comercial - "+ super.toString();
    }
}
