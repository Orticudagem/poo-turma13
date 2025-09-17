package aagustini.poo;

public class PilhaArrayStr implements IPilhaStr {
    private String[] pilha;
    private int count;
    private final int MAX=100;

    public PilhaArrayStr() {
        pilha = new String[MAX];
        count = 0;
    }

    @Override
    public void Empilhar(String val) {
        // deveria ter testado se tem lugar count<MAX
        pilha[count] = val;
        count++;
    }

    @Override
    public String Desempilhar() {
        // deveria testar se count > 0
        count = count - 1;
        return pilha[count];
    }

    @Override
    public String Topo() {
        // deveria testar se count > 0
        return pilha[count-1];   
    }

    @Override
    public Boolean Vazia() {
        return (count == 0);
        // ou...
        // if (count == 0) return true; else return false;
    }
    
}
