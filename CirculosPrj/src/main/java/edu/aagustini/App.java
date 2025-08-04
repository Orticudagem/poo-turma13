package edu.aagustini;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        System.out.println(c1.toString());

       
        
        System.out.println("area do c1: " + c1.area());


        Circulo c2 = new Circulo(3,4,5);
        System.out.println(c2.toString());

        c2.mover(1,3);
        System.out.println(c2.toString());

        c2.zoom(0.5);
        System.out.println(c2.toString());

    }
}
