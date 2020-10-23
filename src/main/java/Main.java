public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new QueueImpl<Integer>(5);
        try {
            q.push(1);
            System.out.println("Size: "+ q.size());
            q.push(2);
            System.out.println("Size: "+ q.size());
            q.push(3);
            System.out.println("Size: "+ q.size());
            q.push(4);
            System.out.println("Size: "+ q.size());
            q.push(5);
            System.out.println("Size: "+ q.size());

            q.pop();
            q.pop();
            q.pop();
            System.out.println("Hem fet 3 pops");


            System.out.println("Size: "+ q.size());

            int val = q.pop();
            System.out.println("valor obtingut "+ val);
            System.out.println("Size: "+ q.size());
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
