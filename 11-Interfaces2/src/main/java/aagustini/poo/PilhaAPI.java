package aagustini.poo;

import java.util.Stack;

public class PilhaAPI<T> implements IPilha<T> {

        private Stack<T> pilha;

        public PilhaAPI() {
            pilha = new Stack<T>();
        }

        public void Empilhar(T val) {
            pilha.push(val);
        }

        public T Desempilhar() {
            if ( !pilha.empty())
                return pilha.pop();
            else
                return null;
        }

        public T Topo() {
            if ( !Vazia() )
                return pilha.peek();
            else return null;
        }


    public Boolean Vazia()  {
            return pilha.empty();
        }
}
