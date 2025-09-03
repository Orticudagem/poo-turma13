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

    @Override
    public String getID() {
        return this.cpf;
    }

    public String getCPF(){
        return this.cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " CPF: " +this.cpf;
    }
    
}
