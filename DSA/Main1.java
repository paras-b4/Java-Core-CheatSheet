public class Main1 {
    public static void main(String[] args) {
         Queue q=new Queue();
        // q.enqueue(10);
        // q.enqueue(20);
        // q.enqueue(30);
        // q.enqueue(40);
        // q.enqueue(50);
        // q.enqueue(60);
        // System.out.println("Dequeue element is : "+q.dequeue());
        // q.Display();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(7);
        q.enqueue(3);
        // System.out.println("deleted element is : "+q.dequeue());
        // System.out.println("deleted element is : "+q.dequeue());
        q.enqueue(9);
        q.enqueue(1);
        q.enqueue(19);
        q.enqueue(15);
        System.out.println("deleted element is : "+q.dequeue());
        //System.out.println("deleted element is : "+q.dequeue());
        q.Display();
        System.out.println("size of queue is : "+q.size());
        System.out.println("is queue is empty : "+q.isempty());
    }
   
}
