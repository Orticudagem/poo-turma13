package poo.aagustini;

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;

    public Cliente(int codigo, String nome, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("%3d / %-10s / %15s",
                                this.codigo,
                                this.nome,
                                this.endereco);
    }
    
    
}
