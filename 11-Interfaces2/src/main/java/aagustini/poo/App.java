package aagustini.poo;

public class App {
 
    public static void mainStr(String[] args) {
        //IPilhaStr p1 = new PilhaArrayStr();
        IPilhaStr p1 = new PilhaAPIStr();

        p1.Empilhar("Ana");
        p1.Empilhar("Julia");
        p1.Empilhar("Pedro");

        // while ( p1.Vazia() == false )
        while ( ! p1.Vazia() )
        {
            //String aux = p1.Desempilhar();
            //System.out.println( aux );

            System.out.println(p1.Topo());
            p1.Desempilhar();
        }

       
    }

    public static void main(String[] args) {
        IPilha<Integer> p1 = new PilhaArray<>();
        //IPilha p1 = new PilhaAPI<Integer>();

        p1.Empilhar(34);
        p1.Empilhar(39);
        p1.Empilhar(58);
        //p1.Empilhar("joao");  // erro: a pilha é de inteiros...

        // while ( p1.Vazia() == false )
        while ( ! p1.Vazia() )
        {
            //String aux = p1.Desempilhar();
            //System.out.println( aux );

            System.out.println(p1.Topo());
            p1.Desempilhar();
        }

        // agora com uma pilha de Strings
        //IPilha<String> p2 = new PilhaAPI<>();
        IPilha<String> p2 = new PilhaArray<>();

        p2.Empilhar("Ana");
        p2.Empilhar("Julia");
        p2.Empilhar("Pedro");
        //p2.Empilhar(58);  // erro: pilha p2 é de strings...

        System.out.println();

        // while ( p1.Vazia() == false )
        while ( ! p2.Vazia() )
        {
            //String aux = p1.Desempilhar();
            //System.out.println( aux );

            System.out.println(p2.Topo());
            p2.Desempilhar();
        }
    }  
}
