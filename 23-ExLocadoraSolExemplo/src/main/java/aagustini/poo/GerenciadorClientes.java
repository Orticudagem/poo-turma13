package aagustini.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorClientes implements Iterable<Cliente> {
    private List<Cliente> lista;

        private static GerenciadorClientes instance;

    public static GerenciadorClientes getInstance() {
        if (instance == null) {
             instance = new GerenciadorClientes(); 
        }
        return instance;
    }
    
    private GerenciadorClientes() { 
        lista = this.gerarUsuarios() ;
    }

    public Cliente buscarCliente(int codCliente) {
        for (Cliente cli : lista) {
            if (cli.getCodigo() == codCliente)
                return cli;
        }
        return null;
    }
    
    public String toString() { return lista.toString();}

    /**
     * Implementação do método iterator() da interface Iterable.
     * Permite usar o GerenciadorClientes em um loop for-each.
     * @return um Iterator<Cliente>
     */
    @Override
    public Iterator<Cliente> iterator() {
        // Apenas delegamos a chamada para o iterator da lista interna
        return lista.iterator();
    }

    public ArrayList<Cliente> gerarUsuarios() {
        ArrayList<Cliente> usuarios = new ArrayList<>();
        
        usuarios.add(new Cliente(1, "Ana Beatriz"));
        usuarios.add(new Cliente(2, "Carlos Eduardo"));
        usuarios.add(new Cliente(3, "Daniela Silva"));

        return usuarios;
    }
}