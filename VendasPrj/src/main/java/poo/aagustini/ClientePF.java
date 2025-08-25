package poo.aagustini;

public class ClientePF extends Cliente {
    private String cpf;

      public ClientePF(int codigo, 
                     String nome, 
                     String endereco,
                     String umCpf) {
        super(codigo, nome, endereco);
        this.cpf = umCpf;
    }

    public String toString() {
        return super.toString() + " CPF: " +this.cpf;
    }
    
}
