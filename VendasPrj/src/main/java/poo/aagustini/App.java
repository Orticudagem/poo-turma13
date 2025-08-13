package poo.aagustini;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(123,"Lapis", 2.5);
        System.out.println(p1);

        // para usar o cadastro de produtos temos de "pegar" a instancia
        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        // agora que tenho a instância posso usar...
        cadProd.cadastrar(p1);   // depois de criar o método cadastrar...
        

    }
}
