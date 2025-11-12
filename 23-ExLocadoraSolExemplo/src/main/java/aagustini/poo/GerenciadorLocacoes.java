package aagustini.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GerenciadorLocacoes implements Iterable<Locacao> {
    private List<Locacao> lista;

    private static GerenciadorLocacoes instance;

    public static GerenciadorLocacoes getInstance() {
        if (instance == null) {
             instance = new GerenciadorLocacoes(); 
        }
        return instance;
    }
    
    private GerenciadorLocacoes() { 
        lista = this.gerarLocacoes();
    }


    public void solicitaLocacao(int codCliente, int codFilme) {
        GerenciadorClientes cadCli = GerenciadorClientes.getInstance();
        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();

        Cliente cli = cadCli.buscarCliente(codCliente);
        Filme filme = cadFilmes.buscarFilme(codFilme);

        if (cli == null || filme == null) {
            throw new IllegalArgumentException("codigo do filme ("+ codFilme+
                                                ") ou do cliente ("+codCliente+")inválido");
        }

        lista.add(new Locacao(LocalDate.now(), cli, filme));


    }
    
    public void LocadosPorCliente(String nomeCliente) {
        System.out.println("Filmes locados pelo cliente: "+ nomeCliente);

        lista.stream()
             //.filter( loc -> loc.getCliente().getNomne().equalsIgnoreCase(nomeCliente))
             .filter( loc -> {
                      Cliente cli = loc.getCliente();
                      if (cli.getNome().equalsIgnoreCase(nomeCliente))
                        return true;
                       else
                        return false;
                      })
            .forEach(loc -> System.out.printf("\t%s - %s\n", 
                            loc.getDate(), loc.getFilme().getNome()));           
    }

    public Long LocadosPorCategoria(Categoria cat) {
        Long result = lista.stream()
                           .filter( loc -> loc.getFilme().getCategoria() == cat)
                           .count();
        return result;

    }

    public void ClientesFilme(String nomeFilme) {
        System.out.println("Clientes que assistiram o filme: " + nomeFilme);
        lista.stream()
             .filter( loc -> loc.getFilme().getNome().equalsIgnoreCase(nomeFilme))
             .map ( loc -> loc.getCliente().getNome())
             .sorted()
             .forEach(System.out::println);        
    }


    // número de filmes locados por catetogoria
    public Map<Categoria,Integer> locadosPorCategoria() {
        Map<Categoria,Integer> dic = new HashMap<>();
        // coloca todas categorias no dicionário
        for (Categoria cat : Categoria.values()) {
            dic.put(cat,0);
        }
        for(Locacao loc : lista) {
            Categoria cat = loc.getFilme().getCategoria();
            // como todas catetorias etão no dicionário apenas somo 1
            dic.put( cat, dic.get(cat) + 1);
        }
        return dic;       
    }

    // número de filmes locados por catetogoria
    public Map<Categoria,Integer> locadosPorCategoria_V2() {
        Map<Categoria,Integer> dic = new HashMap<>();
        for(Locacao loc : lista) {
            Categoria cat = loc.getFilme().getCategoria();
            // verifica se a catetoria está no dicionário
            if ( ! dic.containsKey(cat))
                dic.put(cat, 0);

            // agora soma 1
            dic.put( cat, dic.get(cat) + 1);
        }
        return dic;       
    }

    // filmes nunca locados
    // conforme discutido em aula, nunca deveriamos usar System.out
    // dentro de classes da aplicação, mas a alternância é para 
    // discutir o uso (ativação) dos métodos 
    public void FilmesNuncaLocados() {
        System.out.println("\nFilmes nunca locados");
        Set<String> nomesFilmes = new HashSet<>();
        Set<String> locados = new HashSet<>();

        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();

        // posso fazer o foreach sobre o cadastro pq disse que 
        // a classe é iterável...
        // todos os filmes do cadastro
        for (Filme f : cadFilmes) {
            nomesFilmes.add( f.getNome() );
        }

        // recupera o nome dos filmes locados
        for (Locacao loc : lista) {
            locados.add( loc.getFilme().getNome());
        }
        
        // retira do conjunto os que foram locados
        // A - B --> A.removeAll(B)
        nomesFilmes.removeAll(locados);
        for (String nome : nomesFilmes) {
            System.out.println("\t"+nome);
        }
    }

    public String toString() { return lista.toString();}

    /**
     * Implementação do método iterator() da interface Iterable.
     * Permite usar o GerenciadorClientes em um loop for-each.
     * @return um Iterator<Locacao>
     */
    @Override
    public Iterator<Locacao> iterator() {
        // Apenas delegamos a chamada para o iterator da lista interna
        return lista.iterator();
    }

    /**
     * Gera uma lista fictícia de 50 locações, usando os cadastros existentes.
     * @param cadFilmes O cadastro de filmes de onde buscarFilme será chamado.
     * @param cadClientes O cadastro de clientes de onde buscarCliente será chamado.
     * @return um ArrayList<Locacao> preenchido.
     */
    public ArrayList<Locacao> gerarLocacoes() {
        ArrayList<Locacao> locacoes = new ArrayList<>();
    
        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();
        GerenciadorClientes cadClientes = GerenciadorClientes.getInstance();    

        Random rand = new Random();
        rand.setSeed(42);

        // Arrays com os códigos de ID que sabemos que existem nos seeds
        int[] idsClientes = {1, 2, 3};
        int[] idsFilmes = {
            101, 102, 103, 104, // Comédia
            201, 202, 203, 204, // Ação
            301, 302, 303, 304, // Romance
            401, 402, 403      // Drama
        };

        // Gerar 50 locações
        for (int i = 0; i < 50; i++) {
            // 1. Seleciona um ID de cliente e filme aleatoriamente
            int idClienteAleatorio = idsClientes[rand.nextInt(idsClientes.length)];
            int idFilmeAleatorio = idsFilmes[rand.nextInt(idsFilmes.length)];

            // 2. Busca os objetos usando os métodos solicitados
            Cliente cliente = cadClientes.buscarCliente(idClienteAleatorio);
            Filme filme = cadFilmes.buscarFilme(idFilmeAleatorio);

            // 3. Gera uma data aleatória (no último ano)
            LocalDate data = LocalDate.now().minusDays(rand.nextInt(365));

            // 4. Adiciona a nova locação
            if (cliente != null && filme != null) {
                Locacao loc = new Locacao(data, cliente, filme);
                if ( rand.nextInt(10) > 2) {
                    loc.devolver();
                }
                locacoes.add(loc);
            }
                     
        }

        return locacoes;
    }
    
}