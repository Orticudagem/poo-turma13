package aagustini.poo;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        GerenciadorClientes cadClientes = GerenciadorClientes.getInstance();
        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();
        GerenciadorLocacoes cadLocacoes = GerenciadorLocacoes.getInstance(); 

        System.out.println("\nTodos os clientes:  ");
       for (Cliente cli : cadClientes) {
           System.out.println("\t"+cli);
       }


        System.out.println("\nTodos os filmes: ");
        for (Filme f : cadFilmes) {
            System.out.println("\t"+f);
        }
 
        cadLocacoes.solicitaLocacao(1, 101);
        System.out.println("\nTodas as locações: ");
        for (Locacao l : cadLocacoes) {
            System.out.println(l);
        }  

        System.out.println();

        cadLocacoes.LocadosPorCliente("ana beatriz");
        System.out.println();

        System.out.println("Número de filmes de Comédia: " + 
                              cadLocacoes.LocadosPorCategoria(Categoria.COMEDIA));

        System.out.println();

        cadLocacoes.ClientesFilme("Fuga da Biblioteca à Meia-Noite");
  
        System.out.println();
        System.out.println("\nNúmero de locados por categoria\n");
        Map<Categoria, Integer> locPorCategoria = cadLocacoes.locadosPorCategoria();
        for (Categoria cat : locPorCategoria.keySet()) {
            System.out.printf("\t%10s - %2d\n", cat, locPorCategoria.get(cat));
        }
        System.out.println();

        System.out.println("\nNúmero de locados por categoria versao \n");
        locPorCategoria = cadLocacoes.locadosPorCategoria_V2();
        for (Categoria cat : locPorCategoria.keySet()) {
                System.out.printf("\t%10s - %2d\n", cat, locPorCategoria.get(cat));
            }
         System.out.println();

         cadLocacoes.FilmesNuncaLocados();
    }
}
