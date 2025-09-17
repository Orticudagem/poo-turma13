package aagustini.poo;

//public class PilhaArray implements IPilhaStr  {

public class PilhaArray<T> implements IPilha<T> {

        private Object[] pilha;
        private int topo;

        // Obs: classe sem consistência: topo pode
        // passar do limite, ser inferior a zero, etc.
        public PilhaArray()  {
            pilha = new Object[20];
            topo = 0;
        }

        public void Empilhar(T val) {
            pilha[topo] = val;
            topo++;
        }

        public T Desempilhar() {
            topo--;
            T aux = (T) pilha[topo];
            return aux;
        }

        public T Topo() {
            return (T) pilha[topo-1];
        }

        public Boolean Vazia() {
            //if (topo == 0) return true;
            //else return false;

            return topo == 0;
        }

}
