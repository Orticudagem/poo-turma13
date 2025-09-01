package poo.aagustini;

// produtos alcoolicos possuem 
public class ProdutoAlcoolico extends Produto{

    private double imposto;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco) {
  
        super(umCodigo, umNome, umPreco );
        this.imposto = 1.5;
    }

    // preciso alterar o calculo do valor do produto
    // para incluir o preço
    // quando altero um comportamento herdado => @Override
    @Override
    public double getPreco() {
        double impostoAlcool = super.getPreco() * imposto;
        return super.getPreco() + impostoAlcool;
    }

    @Override
    public String toString() {
       return String.format("%s - Imposto alcool: %.2f%%",
                             super.toString(),
                             this.imposto * 100);
    }

}
