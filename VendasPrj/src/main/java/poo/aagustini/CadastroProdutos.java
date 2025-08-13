package poo.aagustini;

import java.util.ArrayList;

public class CadastroProdutos {
   
    // não devia estar fazendo isto na quinta aula
    // por enquanto vamos ter fé que vai ser útil
    // e que em algum momento vocês vão entender
    //
    // nome disso - padrão de projeto singletom
    //
    private static CadastroProdutos instance;

    public static CadastroProdutos getInstance() {
        if (instance == null) {
            instance = new CadastroProdutos();
        }
        return instance;
    }

    private ArrayList<Produto> listaProd;
    
    private CadastroProdutos() {
        listaProd = new ArrayList<>();
    }

    
}
