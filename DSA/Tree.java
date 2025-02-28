import java.util.Scanner;
class Node{
    int data;
    Node Left;
    Node Right;
    public Object next;
    public Node(int data){
        this.data=data;
    }
}
class BinnaryTree{
    public Node Create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Value");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter the left child of : "+data);
        root.Left=Create();
        System.out.println("Enter the Right child od : "+root.data);
        root.Right=Create();

        return root;

    }
    public void inorder(Node root)
    {
        if(root==null)
        {
            return ; 
        }
        inorder(root.Left);
        System.out.println(root.data);
        inorder(root.Right);
    }
    public void preorder(Node root)
    {
        if(root==null)
        {
            return ; 
        }
        System.out.println(root.data);
        inorder(root.Left);
        inorder(root.Right);
    }
    public void postorder(Node root)
    {
        if(root==null)
        {
            return ; 
        }
       
        inorder(root.Left);
        inorder(root.Right);
        System.out.println(root.data);
    }

}
class Main{
    public static void main(String[] args) 
    {
        BinaryTree b=new BinaryTree();
        Node r=b.Create();
        b.inorder(r);
        b.preorder(r);
        b.postorder(r);
        
    }
}
