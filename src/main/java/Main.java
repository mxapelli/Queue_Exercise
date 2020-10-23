public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new QueueImpl<Integer>(5);
        try {
            q.push(1);
            System.out.println(q.size());
            q.push(2);
            System.out.println(q.size());
            q.push(3);
            System.out.println(q.size());
            q.push(4);
            System.out.println(q.size());
            q.push(5);

            q.pop();
            q.pop();
            q.pop();

            System.out.println(q.size());

            int un = q.pop();
            System.out.println("valor cua "+un);
            System.out.println(q.size());
        }
        catch (FullQueueException fullExp){
            //
            System.out.println("EXCEPCIO!!");
            fullExp.printStackTrace();
        }
        catch (EmptyQueueException empty){
            //
            System.out.println("EXCEPCIO!!");
            empty.printStackTrace();
        }



    }
}
