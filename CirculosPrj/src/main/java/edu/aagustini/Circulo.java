package edu.aagustini;

public class Circulo {
    private double coordX;
    private double coordY;
    private double raio;

    public Circulo() {
        this.coordX = 0;
        this.coordY = 0;
        this.raio = 1;
    }

    public Circulo(double umX, double umY, double raio) {
        this.coordX = umX;
        this.coordY = umY;
        this.raio = raio;
    }

    public void mover(double novoX, double novoY) {
        this.coordX = novoX;
        this.coordY = novoY;
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
        return "Centro: " + this.coordX +
                ", " + this.coordY +
                " raio: " + this.raio;
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