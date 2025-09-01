package edu.aagustini;

public class App {
    public static void main(String[] args) {
        Circulo c1;
        c1 = new Circulo();
        System.out.println(c1.toString());
  
        System.out.println("area do c1: " + c1.area());


        Circulo c2 = new Circulo(3,4,5);
        System.out.println(c2.toString());

        c2.mover(1,3);
        System.out.println(c2.toString());

        c2.zoom(0.5);
        System.out.println(c2.toString());

        // chamei de lista mas está errado, é "só" um array...args
        // listas vão ser estudadas em ALEST I 
        // e em POO vamos usar a biblioteca do java

        Circulo[] lista;   // = new Circulo[3];
        lista = new Circulo[3];

        lista[0] = c1;
        lista[1] = c2;
        lista[2] = new Circulo(8,8,8);

        // vamos listar os circulos da lista
        // 1 - percorrer com o for "clássico"
        System.out.println("\nPercorrendo a lista com for clássico...");
        for(int i = 0; i<lista.length; i++ ){
            Circulo c = lista[i];
            System.out.println(c.toString());
        }

        // 2 - percorrendo com o for cool, legal, maneiro...
         System.out.println("\nPercorrendo a lista com foreach...");
        for(Circulo c : lista){


            
            System.out.println(c.toString());
        }


    }
}
