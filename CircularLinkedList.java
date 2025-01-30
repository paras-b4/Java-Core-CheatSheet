public class CircularLinkedList {
    Node2 head=null;
    Node2 tail=null;
    public void Create(int data)
    {
        Node2 newNode=new Node2(data);
        newNode.next=null;
        if (head==null) 
        {
            head=newNode;
            tail=newNode;
            tail.next=newNode;
        }
       else
       {
         tail.next=newNode;
         tail=newNode;
         newNode.next=head;
       }
    }
    public void insertAtBegining(int data){
        Node2 newNode=new Node2(data);
        newNode.next=null;
        if (head==null) 
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;
       
    }
    public void insertAtEnd(int data)
    {
        Node2 newNode=new Node2(data);
        newNode.next=null;
        if (head==null) 
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            newNode.next=head;
        }
    }
    public void insertAtIndex(int data,int index)
    {
        Node2 newNode=new Node2(data);
        newNode.next=null;
        int i=1;
        Node2 temp=head;
        Node2 prevNode=null;
        int result=getLength();
        if(index>result){
            System.out.println("enter a valid index");
        }
        else if(index==0){
            insertAtBegining(data);
        }
       
        else{
            while(i<=index)
        {
            prevNode=temp;
            temp=temp.next;
            i++;

        }
            prevNode.next=newNode;
            newNode.next=temp;
        }

    }
    public void DeleteFromBeg(){
        if (head==null) 
        {
            System.out.println("Circular LinkedList is Empty");
            
        }
        else{
            head=head.next;
            tail.next=head;
        }
    }
    public void DeleteFromEnd(){
        if (head==null) 
        {
            System.out.println("Circular LinkedList is Empty");
            
        }
        else{
            Node2 temp=head;
            Node2 prevNode=null;
            while (temp.next!=head) 
            {
                prevNode=temp;
                temp=temp.next;
            }
            prevNode.next=head;
            tail=prevNode;
        }
    }
    public void DeleteAtIndex(int index)
    {
        int i=1;
        int result=getLength();
        if(index>result){
            System.out.println("Enter a valid index");
        }
        else if (index==0) {
            DeleteFromBeg();
            
        }
       else{
        Node2 temp=head;
        Node2 prevNode =null;
        while (i<=index)
        {
            prevNode=temp;
            temp=temp.next;
            i++;
        }
        prevNode.next=temp.next;
       }

    }
    public int getLength(){
        int count=0;
        Node2 temp=head;
        while (temp.next!=head) {
            temp=temp.next;
            count=count+1;
        }
        return count;
    }
    public void Display(){
        // Node2 temp=head;
        // while (temp.next!=) 
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }System.out.print(temp.data+" ");
        Node2 temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp.next!=head);
        System.out.print(temp.data+" ");
       



    }
}
