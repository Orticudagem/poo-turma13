package poo.aagustini;

import java.util.ArrayList;

public class CadastroProdutos {
   
    // não devia estar fazendo isto na quinta aula
    // por enquanto vamos ter fé que vai ser útil
    // e que em algum momento vocês vão entender
    //
    // nome disso - padrão de projeto singletom
    //
    //private static CadastroProdutos instance;

    //public static CadastroProdutos getInstance() {
    //    if (instance == null) {
    //        instance = new CadastroProdutos();
    //    }
    //    return instance;
    //}

    private ArrayList<Produto> listaProd;
    
    public CadastroProdutos() {
        listaProd = new ArrayList<>();
    }

    public void cadastrar(int codigo, String nome, double preco){
        Produto prod = new Produto(codigo, nome, preco);
        listaProd.add(prod);
    }

    public Produto pesquisar(int codigo) {
        // podemos percorrer com for tradicional
        // como fizemos no toString
        // mas desta vez faremos com foreach
        //for (int i = 0; i < listaProd.size(); i++){
        //    Produto p = listaProd.get(i);    

        // a linha abaixo fazem exatamente o 
        // mesmo que as duas linhas acima
        for (Produto p : listaProd) {
            if (p.getCodigo() == codigo) {
                return p;
            } 
        }
        // (depois do for) passei por todos e não achei
        return null;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Cadastro de produtos\n");
        // usando for tradicional
        for (int i = 0; i < listaProd.size(); i++){
            Produto p = listaProd.get(i);
            res.append(p.toString()); 
            res.append("\n");
        }
        return res.toString();
    }
}
