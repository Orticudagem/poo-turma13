package poo.aagustini;

import java.util.ArrayList;

public class CadastroClientes {
    private ArrayList<Cliente> lista;

 
    public CadastroClientes() {
        lista = new ArrayList<>();
    }


    public void cadastrar(Cliente cli) {
        lista.add(cli);
    }

    // quero pesquisar pelo cpf, cnpj ou passaporte...
    public Cliente pesquisar(String codigo) {
        for (Cliente c : lista) {
            if ( (c.getID()).equals(codigo)) {
                return c;
            }
        }
    
        return null;
    }

    public String relatorio() {
        StringBuilder rel = new StringBuilder("\nCadastro de clientes\n");
        
        for (Cliente c : lista) {
            rel.append(c.toString());
            rel.append("\n");
        }

        return rel.toString();
    }

}

