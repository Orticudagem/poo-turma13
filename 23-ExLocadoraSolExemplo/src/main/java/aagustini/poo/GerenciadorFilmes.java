package aagustini.poo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GerenciadorFilmes implements Iterable<Filme> {
    private List<Filme> lista;

    private static GerenciadorFilmes instance;

    public static GerenciadorFilmes getInstance() {
        if (instance == null) {
             instance = new GerenciadorFilmes(); 
        }
        return instance;
    }
    
    private GerenciadorFilmes() { 
        lista = this.loadData();
    }
    
    public Filme buscarFilme(int codFilme) {
        for (Filme f : lista) {
            if (f.getCodigo() == codFilme)
                return f;
        }
        return null;
    }
     
    
    public String toString() { return lista.toString();}

    /**
     * Implementação do método iterator() da interface Iterable.
     * Permite usar o GerenciadorClientes em um loop for-each.
     * @return um Iterator<Filme>
     */
    @Override
    public Iterator<Filme> iterator() {
        // Apenas delegamos a chamada para o iterator da lista interna
        return lista.iterator();
    }

    public List<Filme> loadData() {
        
        // Instanciando o ArrayList conforme solicitado
        LinkedList<Filme> filmes = new LinkedList<>();

        // --- COMÉDIA (6 filmes) ---
        filmes.add(new Filme(101, "A Vingança da Alface Mutante", Categoria.COMEDIA));
        filmes.add(new Filme(102, "Meu Chefe é um Zumbi (E Ninguém Percebeu)", Categoria.COMEDIA));
        filmes.add(new Filme(103, "O Pinguim que Queria Ser Cantor de Samba", Categoria.COMEDIA));
        filmes.add(new Filme(104, "Três Avós e um Segredo de Crochê", Categoria.COMEDIA));
        filmes.add(new Filme(201, "Explosão em Baixa Gravidade", Categoria.COMEDIA));
        filmes.add(new Filme(202, "O Resgate do Gato Ninja", Categoria.COMEDIA));
        
        // --- AÇÃO (2 filmes) ---

        filmes.add(new Filme(203, "Fuga da Biblioteca à Meia-Noite", Categoria.ACAO));
        filmes.add(new Filme(204, "Conexão Turbulenta 2: O Retorno do Fax", Categoria.ACAO));

        // --- ROMANCE (4 filmes) ---
        filmes.add(new Filme(301, "Amor Além da Via Láctea", Categoria.ROMANCE));
        filmes.add(new Filme(302, "Enquanto Você Cozinhava o Macarrão", Categoria.ROMANCE));
        filmes.add(new Filme(303, "A Livraria dos Corações Perdidos", Categoria.ROMANCE));
        filmes.add(new Filme(304, "O Fantasma Apaixonado da Cafeteria", Categoria.ROMANCE));

        // --- DRAMA (3 filmes) ---
        filmes.add(new Filme(401, "As Sombras de Ontem", Categoria.DRAMA));
        filmes.add(new Filme(402, "A Última Nota do Piano", Categoria.DRAMA));
        filmes.add(new Filme(403, "O Vento que Sabia Meu Nome", Categoria.DRAMA));

        // 3 filmes nunca locados
        filmes.add(new Filme(501, "A ficcao ficcionada", Categoria.FICCAO));
        filmes.add(new Filme(502, "Canoas - the last frontier", Categoria.FICCAO));
        filmes.add(new Filme(503, "Período de G2 volume 13", Categoria.TERROR));

        // Total: 18 filmes

        return filmes;
    }

}