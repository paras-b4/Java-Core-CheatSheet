public class Stack {
    int arr[]=new int[5];
    int size;
    int top;
    public Stack()
    {
        size=arr.length; 
        top=-1; 
    }
    public void Push(int data)
    {
       top++;
        if (top<size) 
        {
            arr[top]=data;
        }
        else 
        {
            System.out.println("Array out of Bound cannot push elements/ Stack Overflow : conot push Value :"+data);
        }
    }
    public int pop()
    {
       top--;
       if (top>-1) 
       {
            int r=arr[top];
            top--;
            return r;   
       }
       else{
        System.out.println("Stack Underflow");
        return -1;

       }
   
    }
    public int peek()
    {
        // top--;
        return arr[top];

    }

    public void Display()
    {
        System.out.println("Stack Elements are : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
         System.out.println();
        System.out.println("after pop stack elements are : ");
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


 }
// // Main.java
// class stack
// {
//     int stack[]=new int[5];
//     int top;
//     public void push(int data)
//     {
//         if(top==5)
//         {
//             System.out.println("stack is full ");
//         }
//         else{
//             stack[top]=data;
//             top++;
//         }
        
//     }
//     public int pop()
//     {
//         int data=0;
//         if(isempty())
//         {
//             System.out.println("Stack is empty ");
//         }
       
//         else
//         {
//             top--;
        
//             data=stack[top];
//             stack[top]=0;

//         }
        
        
//         return data;
        
        
       
        
//     }
//     public int  peek()
//     {
//         if(isempty())
//         {
//             return 0;
//         }
//         else
//         {

        
//         top--;
//         int data;
//         data=stack[top];
//         return data;
//     }
//     }
//     public int  size()
//     {
//         return top;

//     }
//     public boolean isempty()
//     {
//         return top<=0;
//     }
//     public void show()
//     {
//         for(int n:stack)
//         {
//             System.out.println(n+" ");
//         }
//     }
// }
// class Run
// {
//     public static void main(String[] args) {
//         stack num=new stack();
//         num.push(10);
//         num.show();
//         num.push(20);
//         num.show();
//         num.push(30);
//         num.show();
//         num.push(40);
//         num.show();
//         num.push(50);
//         num.show();
//         num.push(60);
//         num.show();
//         int s=num.size();
//         System.out.println("size of array is : "+s);
//         System.out.println("element pop is : "+ num.pop());
//         System.out.println("element pop is : "+ num.pop());
//         System.out.println("element pop is : "+ num.pop());
//         System.out.println("element pop is : "+ num.pop());
//         System.out.println("element pop is : "+ num.pop());
//         System.out.println("element pop is : "+ num.pop());
//        int p= num.peek();
//        System.out.println("peeek element is : "+p);

//     }
// }
