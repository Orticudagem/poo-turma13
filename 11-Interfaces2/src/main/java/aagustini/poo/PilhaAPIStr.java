package aagustini.poo;

import java.util.Stack;

public class PilhaAPIStr implements IPilhaStr {

        private Stack<String> pilha;

        public PilhaAPIStr() {
            pilha = new Stack<String>();
        }

        public void Empilhar(String val) {
            pilha.push(val);
        }

        public String Desempilhar() {
            if ( !pilha.empty() )
                return pilha.pop();
            else
                return null;
        }

        public String Topo() {
            if ( !Vazia() )
                return pilha.peek();
            else return null;
        }


    public Boolean Vazia()  {
            return pilha.empty();
        }
}
