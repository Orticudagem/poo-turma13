package poo.aagustini;

import java.time.LocalDate;


// Usando herança
// extends -  ProdutoEE "é um tipo de" Produto
public class ProdutoEE extends Produto {
    // atributos são "HERDADOS"
    //private int codigo;
    //private String nome;
    //private double preco;
    private int diasGarantia;

    public ProdutoEE(int umCodigo, 
                    String umNome, 
                    double umPreco,
                    int diasGarantia) {
        // super - procura na "super classe"  (Produto)
        // um construtor que receba: (int, String, double)             
        super(umCodigo, umNome, umPreco);
        this.diasGarantia = diasGarantia;
    }

    public String getGarantia() {
        LocalDate hoje = LocalDate.now();
        String garantia = "Produto: " + getNome()  +
                          "\nDias garantia: " + this.diasGarantia +
                          "\nVencimento garantia: " + hoje.plusDays(diasGarantia);

        return garantia;

    }

    @Override
    public String toString() {
        // funciona assim mas não gosto
        //   ... porque é ineficiente

       // return "("+codigo+") /t "+nome+"\t"+preco;

       // assim funciona, mas não quero
       // return String.format("(%d) \t %s \t R$ %.2f - Garantia: %d dias",
       //                      this.getCodigo(),
       //                      this.getNome(),
       //                    this.getPreco(),
       //                      this.diasGarantia);

       //  reusando o toString da super classe
              // assim funciona, mas não quero
       return String.format("%s - Garantia: %d dias",
                             super.toString(),
                             this.diasGarantia);
    }

}
