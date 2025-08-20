package poo.aagustini;

public class ItemVenda {
    private int qtde;
    private Produto prod;

    public ItemVenda(int umaQtde, Produto umProd) {
        this.qtde = umaQtde;
        this.prod = umProd;
    }

    public double getValor() {
        return prod.getPreco() * qtde;
    } 

    @Override
    public String toString() {
        return String.format("%-10s \t %3d \t R$ %5.2f",
                             prod.getNome(),
                             qtde,
                             this.getValor());


    }
}
