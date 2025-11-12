package aagustini.poo;

public class Filme {
    private int codigo;
    private String nome;
    private Categoria categoria;

    public Filme(int umCodigo, String umNome, Categoria cat) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.categoria = cat;
    }

    public int getCodigo() { return codigo;}
    public String getNome() {return nome;}

    public Categoria getCategoria() {return categoria;}

    @Override
    public String toString() {
        return String.format("%3d, %s, %s", codigo, nome, categoria);
    }
}