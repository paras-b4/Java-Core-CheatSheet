public class Runner1 {
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        d.Create(10);
        d.Create(20);
        d.Create(30);
        d.Create(40);
        d.Create(50);
        d.Create(60);
        d.insertAtBegining(100);
        d.insertAtEnd(90);
        d.insertAtIndex(120, 1);
        d.DeleteFromBeg();
        d.DeleteFromEnd();
        d.DeleteAtIndex(5);
        d.Display();
    }
    
}
