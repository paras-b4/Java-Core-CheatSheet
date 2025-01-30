public class Runner2 {
    public static void main(String[] args) {
        CircularLinkedList c=new CircularLinkedList();
        c.Create(10);
        c.Create(20);
        c.Create(30);
        c.Create(40);
        c.Create(50);
        c.insertAtBegining(100);
        c.insertAtEnd(90);
        c.insertAtIndex(120, 5);
        c.DeleteFromBeg();
        c.DeleteFromEnd();
        c.DeleteAtIndex(10);
        c.Display();
    }
}
