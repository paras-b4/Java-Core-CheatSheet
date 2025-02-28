import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class graph{
    LinkedList<Integer> adjacency[];
    public graph(int v)
    {
        adjacency=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjacency[i]=new LinkedList<>();
        }
    }
    public void insert(int s,int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public void bfs(int data){
        boolean visited_node[]=new boolean[adjacency.length];
        int parent_node[]=new int[adjacency.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(data);
        visited_node[data]=true;
        parent_node[data]=-1;
        while (!q.isEmpty()) 
        {
            int p=q.poll();
            System.out.print(p);
            for(int i:adjacency[p])
            {
                if (visited_node[i]!=true) 
                {
                    visited_node[i]=true;
                    q.add(i);
                    parent_node[i]=p;
                }
            }
    }
}

    public void dfs(int data){
        boolean visited_node[]=new boolean[adjacency.length];
        int parent_node[]=new int[adjacency.length];
        Stack<Integer> q=new Stack<>();
        q.add(data);
        visited_node[data]=true;
        parent_node[data]=-1;
        while (!q.isEmpty()) 
        {
            int p=q.pop();
            System.out.print("Element in dfs :"+p);
            for(int i:adjacency[p])
            {
                if (visited_node[i]!=true) 
                {
                    visited_node[i]=true;
                    q.add(i);
                    parent_node[i]=p;
                }
              
            }
    }

}}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of edge ");
        int e=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the no of vertices");
        int v=sc.nextInt();
        graph g=new graph(v);
        
        for(int i=0;i<e;i++){
            System.out.println("Enter the edge no :"+i);
            int s=sc.nextInt();
            sc.nextLine();
            int d=sc.nextInt();
            g.insert(s,d);
        }
        
        System.out.println("Enter a source for bfs");
        int s=sc.nextInt();
        g.bfs(s);
        System.out.println();
        sc.nextLine();
        g.dfs(s);
    
    }
}
class Node{
    int data;
    Node Left;
    Node Right;
    public Node(int data){
        this.data=data;
    }
}
class Tree
{
    public Node Create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int data=sc.nextInt();
        if (data==-1) 
        {
            return null;
            
        }
        Node root=new Node(data);
        System.out.println("enter the left child of :"+root.data);
        root.Left=Create();
        System.out.println("enter the right child of :"+root.data);
        root.Right=Create();
        return root;
    }
    public void inorder(Node r)
    {
        if (r==null) 
        {
            return;
        }
        inorder(r.Left);
       
        System.out.print("Inorder : "+r.data+" ");
        inorder(r.Right);
    }
}
class Mian1 {
    public static void main(String[] args) {
        Tree t=new Tree();
        Node root=t.Create();
        t.inorder(root);
    }

    
}
class Quick{

    public void QuickSort(int arr[],int low,int high)
    {
        if (low<high) 
        {
            int pi=partition(arr,low,high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    }
    public int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++ )
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    
    }
    public static void main(String[] args) {
        int arr[]={10,11,9,8,15,14,13,16};
        Quick q=new Quick();
        q.QuickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting is : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
// binary serach
class Binary{

    public int  BinarySearch(int arr[],int t,int low,int high)
    {
        while (low<=high) 
        {
            int mid=(low+high)/2;
            if (arr[mid]==t) 
            {
                return mid;
            }
            else if(arr[mid]<t)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return  -1;

    }
    public static void main(String[] args) {
        int arr[]={10,15,16,18,19,21,25,35,};
        int low=0;
        int high=arr.length;
        int temp=10;
        Binary b=new Binary();
        int result=b.BinarySearch(arr,temp,low,high);
        System.out.println("Element found at index : "+result);

    }
}
// Linear search
class Linear{

    public int LinearSearch(int arr[],int temp)
    {
        for(int i=0;i<arr.length;i++){
            if (arr[i]==temp) {
                return i;
                
            }
        }
        return-1;

    }
    public static void main(String[] args) {
        int arr[]={10,9,11,15,14,13,17};
        int temp=10;
        Linear l=new Linear();
        int result=l.LinearSearch(arr,temp);
        System.out.println("Element found at index : "+result);
        
    }
}