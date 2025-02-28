public class Queue {
    int front=0;
    int rear=-1;
    int size=0;
    int arr[]=new int[5];
    
    public void enqueue(int data)
    {
         {
            rear=(rear+1)%5;
            arr[rear]=data;
            size++;
        }
        // else{
        //     System.out.println("Queue is full : conot add "+data);
        // }
       
    }
    public int dequeue()
    {
        int r=arr[front];
        front=(front+1)%5;
        size=size-1;
        return r;

    }
    // public boolean isFull(){
    //     return size>4;
    // }
    public int size(){
        return size;
    }
    public boolean isempty(){
        return size<=0;
    }

    public void Display()
    {
        System.out.println("Elements in queue");
        // for(int a:arr){
        //     System.out.print(a+" ");
        // }
        // System.out.println();
        // System.out.println("Elements in queue after dequeue");
        for(int i=0;i<=size;i++)
        {
            System.out.print(arr[(i+front)%5]+" ");
        }
        System.out.println();
    }

}
// class Queue
// {
//     int Queue[]=new int[5];
//     int front;
//     int rear;
//     int size;
//     public void EnQueue(int data)
//     {
//         Queue[rear]=data;
//         rear=(rear+1)%5;
//         size=size+1;
//     }
//     public int DeQueue()
//     {
//         int data;
//         data=Queue[front];
//         Queue[front]=0;
//         front=(front+1)%5;
//         size=(size-1);
//         return data;
        

//     }
//     public int size()
//     {
//         return size;
//     }
//     public boolean isempty()
//     {
//         return size<=0;
//     }
//     public void show()
//     {
//         for(int i=0;i<size;i++)
//         {
//             System.out.println(Queue[(i+front)%5]);
//         }
//         for(int n:Queue)
//         {
//             System.out.println("Element are : "+ n);
    
//         }
//     }
// }
// class Run1
// {
//     public static void main(String[] args) {
//         Queue num=new Queue();
//         num.EnQueue(5);
//         num.EnQueue(2);
//         num.EnQueue(7);
//         num.EnQueue(3);
//         System.out.println("deleted element is : "+num.DeQueue());
//         System.out.println("deleted element is : "+num.DeQueue());
//         num.EnQueue(9);
//         num.EnQueue(1);
//         num.EnQueue(19);
//         num.EnQueue(15);
//         num.show();
//         System.out.println("size of queue is : "+num.size());
//         System.out.println("is queue is empty : "+num.isempty());

//     }
// }