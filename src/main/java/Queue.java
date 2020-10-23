public interface Queue<E> {
    /**
     * Metode que permet afegir/encuar un nou element a la cua
     * @param e l'element a "encuar"
     * @throws FullQueueException llenca aquesta excepcio en el cas que
     * la cua estigui plena
     */
    public void push(E e) throws FullQueueException;
    public E pop() throws EmptyQueueException;
    public int size();
}
