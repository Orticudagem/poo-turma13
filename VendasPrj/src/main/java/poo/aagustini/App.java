package poo.aagustini;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(123,"Lapis", 2.5);
        System.out.println(p1);

        // para usar o cadastro de produtos temos de "pegar" a instancia
        //CadastroProdutos cadProd = CadastroProdutos.getInstance();

        // agora que tenho a instância posso usar...
        //cadProd.cadastrar(p1);   // depois de criar o método cadastrar...
        
        CadastroProdutos cadProdutos = new CadastroProdutos();
        cadProdutos.cadastrar(123, "lapis", 2.5);
        cadProdutos.cadastrar(124, "caneta", 5);
        cadProdutos.cadastrar(125, "borracha", 4.5);

        System.out.println("\n");
        System.out.println(cadProdutos.toString());
        System.out.println();

        Produto p = cadProdutos.pesquisar(123);
        if ( p != null) {
            System.out.println("\nAchou: "+p.toString());
            // testando a classe ItemVenda
            // só para teste, esta classe só "existe" 
            //     dentro da classe Venda
            ItemVenda iv1 = new ItemVenda(10, p);
            System.out.println("ItemVenda: " + iv1.toString());


        } else {
            System.out.println("\nProduto 123 não está no cadastro");
        }

        p = cadProdutos.pesquisar(200);
        if ( p != null) {
            System.out.println("\nAchou: "+p.toString());
        } else {
            System.out.println("\nProduto 200 não está no cadastro");
        }

        System.out.println("\n");
        Venda venda1 = new Venda();
        venda1.inserir(10, cadProdutos.pesquisar(123));
        venda1.inserir(cadProdutos.pesquisar(125));

        System.out.println(venda1.fecharVenda());


        




    }
}
