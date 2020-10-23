import java.util.ArrayList;

public class QueueImpl<E> implements Queue<E> {

    private E[] data;
    int len;
    int maxLength;

    public QueueImpl(int len){
        this.data = len; // // Object[len]
    }
    @Override
    public void push(E e) throws FullQueueException {
        if (this.estaPlena()) throw new FullQueueException();

        this.data[this.p++] = e;


    }

    @Override
    public E pop() throws EmptyQueueException {
        if (this.estaBuida()) throw new EmptyQueueException();

        E primer = this.data[0];

        //lshift();

        return primer;
    }

    @Override
    public int size() {
        return this.len;
    }

}
