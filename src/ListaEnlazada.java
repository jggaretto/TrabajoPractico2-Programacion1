public class ListaEnlazada<T> {
    private Nodo<T> cabeza;
    private int tamanio;

    public void agregar(T dato) {
        if (cabeza == null) {
            cabeza = new Nodo<>(dato);
        } else {
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente() != null) aux = aux.getSiguiente();
            aux.setSiguiente(new Nodo<>(dato));
        }
        tamanio++;
    }

    public T obtener(int indice) {
        Nodo<T> aux = cabeza;
        int contador = 0;
        while (aux != null) {
            if (contador == indice) return aux.getDato();
            aux = aux.getSiguiente();
            contador++;
        }
        throw new IndexOutOfBoundsException("Indice invalido");
    }

    public int getTamanio() { return tamanio; }
}
