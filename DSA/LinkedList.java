class Node {
    int data;
     Node next;
    public Node(int data){

        this.data=data;
        
    }
}
class LinkedList{

    Node head=null;

   
    public void Create(int data) {
        Node newnode=new Node(data);
        newnode.next=null;
        if (head==null)
        {
            head=newnode;
        }
        else{
            Node temp=head;
            while (temp.next!=null) {
               
                temp=temp.next;
                
            }
            temp.next=newnode;
            
            
        }

        }
    public void insertAtBegining(int data){
        Node newnode=new Node(data);
        newnode.next=null;
        if(head==null){
            head=newnode;
            
        }
        else{
          newnode.next=head;
          head=newnode;
        }
    }
    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        newnode.next=null;
        Node temp=head;
        while (temp.next!=null) 
        {
            temp=temp.next;
        }
        temp.next=newnode;
        temp=newnode;

    }
    public void insertAtIndex(int data,int index){
        Node newNode =new Node(data);
        newNode.next=null;
        Node temp=head;
       
        int i=1;
        //int count=0;
        // while(temp.next!=null){

        //     count=count+1;
        //     temp=temp.next;
        // }
        int result=getLength();
        if (index > result) {
            System.out.println("enter a valid index");
            
        }
        else if (index==0) {
            insertAtBegining(data);
        }
        else{
            while (i<index) 
        {
            
            temp=temp.next;
            i++;
            
        }
        newNode.next=temp.next;
        temp.next=newNode;
        }

    }
    public int getLength(){
         int count=0;
         Node temp=head;
        while(temp.next!=null){

            count=count+1;
            temp=temp.next;
        }
        //System.out.println("length of linkedlist is "+ count);
        return count;
       
      
    }
    public void DeleteFromBeg(){
        if(head==null){
            System.out.println("Linked List is Empty");
        }
        else{
            head=head.next;
        }
    }
    public void DeleteFromEnd(){
        if (head==null){
            System.out.println("linked list is empty");
            
        }
        else{
            Node temp=head;
           Node prevNode=null;
            while (temp.next!=null) 
            {
                prevNode=temp;
                temp=temp.next;
            }
            prevNode.next=null;
            
        }
    }
    public void DeleteAtIndex(int index){
        Node temp=head;
        Node prevNode=null;
        int i=1;
        int result=getLength();
        if (index==0) 
        {
            DeleteFromBeg();     
        }
        else if (i>result) {
            System.out.println("enter a valid index");
            
        }
      else {
        while (i<=index)
        {
            prevNode=temp;
            temp=temp.next;
            i++;
        }
        prevNode.next=temp.next;
       }

    }
    public void Display(){
        Node temp=head;
        while (temp.next!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        // do{
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
            
        // }while(temp.next!=null);
        // System.out.print(temp.data+" ");
    }
}