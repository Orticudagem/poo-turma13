package poo.aagustini;

import java.util.ArrayList;

public class Venda {
    // tema de casa (1)... fazer alterar para ter um cliente
    //private Cliente cliente;

    private ArrayList<ItemVenda> itens;

    public Venda() {
        itens = new ArrayList<>();
    }

    public void inserir(Produto prod) {
        ItemVenda item = new ItemVenda(1, prod);
        itens.add(item);
    }
    
    public void inserir(int quantidade, Produto prod) {
        ItemVenda item = new ItemVenda(quantidade, prod);
        itens.add(item);
    }

    // tema de casa (4) 
    // criar um novo inserir que recebe uma quantidade e um
    //    código de produto e somente insere se o produto estiver no cadastro
    // atenção - tem uma pegadinha aqui 

    public double valorTotal() {
        // tema de casa (2) calcular e devolver o valor total
        double total = 0;

        // ...

        return total;
    }

    public String fecharVenda() {
        // gera a nota de venda
        StringBuilder notaF = new StringBuilder("\nSuper vendas - POO \n");

        // tema (3) Adicionar nome do cliente

        for (ItemVenda item : itens) {
            notaF.append("\t");
            notaF.append(item.toString());
            notaF.append("\n");
        }

        notaF.append("\n\t Valor total: "+ this.valorTotal());
        
        return notaF.toString();
    }
    
}
