package aagustini.poo;

public class Residencial extends Imovel {
    private int areaTerreno;

       public Residencial(String propr, int area, 
                            Geo geoLoc, int terreno) {
            super(propr, area, geoLoc);
            this.areaTerreno = terreno;
    }

       @Override
       public double calculaImposto() {
        double valor;
        int areaC = getAreaConstruida();

        if (areaC <= 200) {
            valor = 0;
        } else {
            valor = (areaC- 200) * Imovel.getVR();
        }

        if (areaTerreno > 1000) {
            valor = valor + 100 * Imovel.getVR();
        }

        return valor;
    }  

    @Override
    public String toString() {
        String res =  "residencial - "+ super.toString();
        if (areaTerreno > 1000) 
            res = res +" imposto terreno: " + 100 * Imovel.getVR();
        
        return res;
    } 

}
