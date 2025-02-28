public class DoublyLinkedList {
    Node1 head=null;
    Node1 tail=null;
    public void Create(int data){
        Node1 newNode=new Node1(data);
        newNode.next=null;
        newNode.prev=null;
        if (head==null) 
        {
            head=newNode;
        }
        else{
            Node1 temp=head;
            while (temp.next!=null) 
            {
                temp=temp.next;   
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void insertAtBegining(int data){
        Node1 newNode=new Node1(data);
        newNode.next=null;
        newNode.prev=null;
        if (head==null) 
        {
            head=newNode;
            
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
     
    }
    public void insertAtEnd(int data){
        Node1 newNode=new Node1(data);
        newNode.next=null;
        newNode.prev=null;
        if (head==null) {
            head=newNode;
        }

        else{
            Node1 temp=head;
            while (temp.next!=null) 
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void insertAtIndex(int data,int index)
    {
        Node1 newNode=new Node1(data);
        newNode.next=null;
        newNode.prev=null;
        int result=getLength();
        if(index>result)
        {
            System.out.println("enter a valid index");
            
        }
        else if (index==0) 
        {
            insertAtBegining(data);
            
        }
        else{
        int i=1;
        Node1 temp=head;
        Node1 prevNode=null;
        while (i<=index) 
        {
            prevNode=temp;
            temp=temp.next;
            i++;
        }
            prevNode.next=newNode;
            newNode.prev=prevNode;
            newNode.next=temp;
            temp.prev=newNode;
        }

    }
    public void DeleteFromBeg(){
        if (head==null) 
        {
            System.out.println("Doubly LinkedList is Empty");
            
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public void DeleteFromEnd()
    {
        if (head==null) 
        {
            System.out.println("Doubly LinkedList is Empty");
            
        }
        else{
            Node1 temp=head;
        Node1 prevNode=null;
        while (temp.next!=null) 
        {
            prevNode=temp;
            temp=temp.next;
        }
        prevNode.next=null;
        }

    }
    public void DeleteAtIndex(int index)
    {
        int result=getLength();
        if (index>result) {
            System.out.println("Enter a valid index ");
        }
       else if (index==0) 
       {
        DeleteFromBeg();
       }
       else{
        int i=1;
        Node1 temp=head;
        Node1 prevNode=null;
        while (i<=index){
            prevNode=temp;
            temp=temp.next;
            i++;
        }
        prevNode.next=temp.next;
        temp.next.prev=prevNode;

       }
    }
    
    public int getLength(){
        int count=0;
        Node1 temp=head;
        while (temp.next!=null) 
        {
            count=count+1;
            temp=temp.next;
            
        }
        return count;
    }

    public void Display(){
        Node1 temp=head;
        while (temp.next!=null) 
        {
            System.out.print(temp.data+" "); 
            temp=temp.next;  
        }  
        System.out.print(temp.data+" ");
        System.out.println();
        System.out.println("Backward Traversal");
        Node1 temp1=head;
        while (temp1.next!=null) 
        {
            temp1=temp1.next; 
        } 
        tail=temp1;
        Node1 temp2=tail;
        while (temp2.prev!=null) 
        {
            System.out.print(temp2.data+" "); 
            temp2=temp2.prev; 
        } System.out.print(temp2.data+" "); 

    }
}
