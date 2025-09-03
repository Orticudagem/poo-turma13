package poo.aagustini;

public class ClientePJ extends Cliente {
       private String cnpj;

      public ClientePJ(int codigo, 
                     String nome, 
                     String endereco,
                     String umCnpj) {
        super(codigo, nome, endereco);
        this.cnpj = umCnpj;
    }

    @Override
    public String getID() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + " CNPJ: " +this.cnpj;
    }
    
    
}
