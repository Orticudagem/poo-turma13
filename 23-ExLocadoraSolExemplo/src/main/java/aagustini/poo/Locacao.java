package aagustini.poo;

import java.time.LocalDate;

public class Locacao {
    private LocalDate data;
    private Cliente cliente;
    private Filme filme;
    private boolean devolvido;

    public Locacao(LocalDate umaData, Cliente c, Filme f) {
        this.data = umaData;
        this.cliente = c;
        this.filme = f;
        this.devolvido = false;
    }

    public void devolver() {
        this.devolvido = true;
    }

    public LocalDate getDate() {
        return data;
    }

    public Cliente getCliente() { return cliente;}
    public Filme getFilme() {return filme;}

    public String toString() { 
        return String.format("%s (%s), %s, %s", 
                                    data, 
                                    devolvido ? "devolvido" : "locado",
                                    cliente, 
                                    filme);  
    }
}