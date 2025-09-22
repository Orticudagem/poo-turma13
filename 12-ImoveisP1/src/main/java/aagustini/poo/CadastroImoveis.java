package aagustini.poo;

import java.util.ArrayList;

public class CadastroImoveis {
    private ArrayList<Imovel> imoveis = new ArrayList<>();

    public void cadastrar(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void listarSOUT() {
        int count  = 0;
        System.out.println("\n\nCadastro de imoveis:");
        for (Imovel imovel : imoveis) {
            // contar os residenciais...
            if (imovel instanceof Residencial) {
                // se quisesse fazer algo que só tem 
                // em residencial - precisa casting
                // Residencial res = (Residencial) imovel;
                count++;
            }
            System.out.println(imovel.toString());
        }
        System.out.println("\nNumero de residenciais: "+count);
        System.out.println();
    }

    public String listar() {
        StringBuilder res = new StringBuilder("\n\nCadastro de imoveis:");
        for (Imovel imovel : imoveis) {
            res.append(imovel.toString());
            res.append("\n");
        }
        return res.toString();
    }


    public void listar(String nome) {
        System.out.println("\n\nCadastro de imoveis do propr:" + nome);
        //for (Imovel imovel : imoveis) {
        for (int i = 0; i < imoveis.size(); i++) {
            Imovel imovel = imoveis.get(i);
            if (imovel.getProprietario().equals(nome))
               System.out.println(imovel.toString());
        }
        System.out.println();
    }

    
}
