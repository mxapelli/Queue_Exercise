import java.util.ArrayList;

public class QueueImpl<E> implements Queue<E> {

    private ArrayList<E> data = new ArrayList<E>();
    int len;
    int maxLength;

    public QueueImpl(int num){
        this.maxLength = num;
        this.len = 0;
    }


    public void push(E e) throws FullQueueException {
        if (this.maxLength> this.len ){
            this.data.add(e);
            this.len++;

        }
        else{
            throw new FullQueueException();
        }
    }

    public E pop() throws EmptyQueueException {
        if (this.len==0){
            throw new EmptyQueueException();
        }
        else{
            E primer = data.remove(0);
            this.len--;
            return primer;

        }
    }

    public int size() {
        return this.len;
    }
}
