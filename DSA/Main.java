class Main{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.Push(10);
        s.Display();
        s.Push(20);
        s.Display();
        s.Push(30);
        s.Display();
         s.Push(40);
         s.Display();
        s.Push(50);
        s.Display();
        int p=s.peek();
        System.out.println("peek element is "+p);
        s.Push(60);
        int r=s.pop();
        System.out.println("Pop element is : "+r);
        
        s.Display();
    }
}
