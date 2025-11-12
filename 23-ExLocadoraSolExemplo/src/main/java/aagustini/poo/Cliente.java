package aagustini.poo;


public class Cliente {
    private int codigo;
    private String nome;

    public Cliente(int umCodigo, String umNome) {
        this.codigo = umCodigo;
        this.nome = umNome;
    }
    public int getCodigo() { return codigo;}
    public String getNome() {return nome;}

    @Override
    public String toString() { 
        return String.format("%3d, %s", codigo, nome);
    }


}