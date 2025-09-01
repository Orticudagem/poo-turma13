package edu.aagustini;

public class Circulo {
    // Refatorando para usar a classe Ponto...
    //private double coordX;
    //private double coordY;

    private Ponto centro;
    private double raio;

    public Circulo() {
        //this.coordX = 0;
        //this.coordY = 0;

        centro = new Ponto(0,0);
        this.raio = 1;
    }

    public Circulo(double umX, double umY, double raio) {
        //this.coordX = umX;
        //this.coordY = umY;

        centro = new Ponto(umX, umY);
        this.raio = raio;
    }

    public Circulo( Ponto centro, double umRaio) {
        this.centro = centro;
        this.raio = umRaio;
    }


    public void mover(double novoX, double novoY) {
        //this.coordX = novoX;
        //this.coordY = novoY;

        // 1. criando um novo Ponto para o centro
        //this.centro = new Ponto(novoX, novoY);

        // 2. alterar a posição do ponto
        centro.mover(novoX, novoY);

    }

    public void zoom(double fator){
        this.raio = this.raio * fator;
    }

    public double area() {
        double area = Math.PI * Math.pow(raio, 2);

        return area;
    }

    @Override
    public String toString(){
        return "Centro: " + centro.toString() +
                " raio: " + this.raio + 
                " area: " + this.area();
    }

  /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circulo{");
        sb.append("coordX=").append(coordX);
        sb.append(", coordY=").append(coordY);
        sb.append(", raio=").append(raio);
        sb.append('}');
        return sb.toString();
    }
    */


}